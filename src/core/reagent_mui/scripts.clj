(ns reagent-mui.scripts
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :refer [pprint]]
            [camel-snake-kebab.core :as csk]
            [clojure.java.io :as io]
            [instaparse.core :as insta])
  (:import (java.io File)))

;; [instaparse "1.4.10"]
;; (write-core)
;; (write-ext-file)
;; (write-entry-files)
;; (write-icons "/Users/arttuka/workspace/arttuka/material-ui/packages/mui-icons-material/lib/esm")
;; npm run build
;; (write-deps-file)

(def exclude-clj #{"comment" "compare" "filter" "list" "loop" "map" "print" "remove" "repeat" "shuffle" "sort" "update"})
(def exclude-material #{"TextField" "TextareaAutosize" "createFilterOptions"})
(def js-keyword-icons #{"class" "delete" "public"})
(def js-keyword-components #{"switch"})
(def stable? false)

(defn resource-name [n]
  (str n (when stable? "-stable") ".edn"))

(defn component-ns-name [js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (if (contains? js-keyword-components clj-name)
      (str clj-name "-component")
      clj-name)))

(defn icon-ns-name [svg-name]
  (let [clj-name (csk/->kebab-case svg-name)]
    (if (contains? js-keyword-icons clj-name)
      (str clj-name "-icon")
      clj-name)))

(defn mui-name [js-ns js-name]
  (str "(.-" (or js-name "default") " Mui" js-ns ")"))

(defn root-name [mui-ns js-ns]
  (str (case mui-ns
         "material" "MuiMaterial"
         "lab" "MuiLab"
         "core" "MuiCore")
       (csk/->PascalCase js-ns)))

(defn generate-component-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-mui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @mui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a Reagent component." \newline
         "   Original documentation is at https://mui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-mui.util :refer [adapt-react-class]]" \newline
         "            [\"@mui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (adapt-react-class " (mui-name js-ns js-name) " \"mui-" clj-name "\"))" \newline)))

(defn generate-hook-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-mui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @mui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a React hook." \newline
         "   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks" \newline
         "   Original documentation is at https://mui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-mui.util :refer [wrap-js-function]]" \newline
         "            [\"@mui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (wrap-js-function " (mui-name js-ns js-name) "))" \newline)))

(defn write-component-ns [mui-ns js-ns js-name]
  (let [hook? (str/starts-with? (or js-name js-ns) "use")
        content ((if hook? generate-hook-ns-content generate-component-ns-content)
                 mui-ns js-ns js-name)
        path (str "./src/core/reagent_mui/" mui-ns "/" (csk/->snake_case (component-ns-name js-ns js-name)) ".cljs")]
    (spit path content)))

(defn generate-common-material-ns-content [js-names]
  (let [clj-names (for [[js-ns js-name] js-names]
                    (csk/->kebab-case (or js-name js-ns)))]
    (str "(ns reagent-mui.components" \newline
         "  \"Imports all components from @mui/material as Reagent components." \newline
         "   Original documentation is at https://mui.com/api/ .\"" \newline
         "  (:refer-clojure :exclude [" (str/join " " (keep exclude-clj clj-names)) "])" \newline
         "  (:require "
         (str/join "\n            " (for [clj-name clj-names]
                                      (str "reagent-mui.material." (component-ns-name clj-name nil))))
         "))" \newline \newline
         (str/join \newline (for [clj-name clj-names]
                              (str "(def " clj-name " reagent-mui.material." (component-ns-name clj-name nil) "/" clj-name ")")))
         \newline)))

(defn get-component-names [& files]
  (for [file files
        elem (edn/read-string (slurp (io/resource (resource-name file))))]
    (if (vector? elem) elem [elem nil])))

(defn get-distinct-names [& files]
  (distinct (map first (apply get-component-names files))))

(def ->js-name (into {} (concat
                         (for [n (get-distinct-names "material" "additional-material")]
                           [(str "mui-material-" (csk/->kebab-case n)) (str "@mui/material/" n)])
                         (for [n (get-distinct-names "core" "additional-core")]
                          [(str "mui-core-" (csk/->kebab-case n)) (str "@mui/core/" n)]))))

(defn format-dependency [d]
  (cond
    (= "mui-material" d) "@mui/material"
    (= "mui-material-styles" d) "@mui/material/styles"
    (= "mui-material-utils" d) "@mui/material/utils"
    (= "mui-styles" d) "@mui/styles"
    (= "mui-core" d) "@mui/core"
    (= "mui-utils" d) "@mui/utils"
    (= "mui-lab" d) "@mui/lab"
    (str/starts-with? d "mui-") (->js-name d)
    :else d))

(defn print-return [x]
  (clojure.pprint/pprint x)
  x)

(defn get-dependencies [f]
  (let [deps-line (with-open [rdr (io/reader (str "reagent-material-ui-js/src/" f))]
                    (first (filter #(str/includes? % "factory(") (line-seq rdr))))
        re #"require\(\"([^\"]*)\"\)"]
    (->> (re-seq re deps-line)
         (map second)
         (distinct)
         (map format-dependency)
         (sort)
         (vec))))

(defn write-deps-file []
  (let [material-names (get-distinct-names "material" "additional-material")
        lab-names (get-distinct-names "lab")
        core-names (get-distinct-names "core" "additional-core")
        deps {:foreign-libs (mapv (fn [lib] (assoc lib :requires (get-dependencies (:file lib))))
                                  (concat [{:file           "mui/mui-material.inc.js"
                                            :file-min       "mui/mui-material.min.inc.js"
                                            :provides       ["@mui/material"]
                                            :global-exports {"@mui/material" 'MuiMaterial}}
                                           {:file           "mui/mui-material-styles.inc.js"
                                            :file-min       "mui/mui-material-styles.min.inc.js"
                                            :provides       ["@mui/material/styles"]
                                            :global-exports {"@mui/material/styles" 'MuiMaterialStyles}}
                                           {:file           "mui/mui-material-utils.inc.js"
                                            :file-min       "mui/mui-material-utils.min.inc.js"
                                            :provides       ["@mui/material/utils"]
                                            :global-exports {"@mui/material/utils" 'MuiMaterialUtils}}
                                           {:file           "mui/mui-lab.inc.js"
                                            :file-min       "mui/mui-lab.min.inc.js"
                                            :provides       ["@mui/lab"]
                                            :global-exports {"@mui/lab" 'MuiLab}}
                                           {:file           "mui/mui-core.inc.js"
                                            :file-min       "mui/mui-core.min.inc.js"
                                            :provides       ["@mui/core"]
                                            :global-exports {"@mui/core" 'MuiCore}}
                                           {:file           "mui/mui-styles.inc.js"
                                            :file-min       "mui/mui-styles.min.inc.js"
                                            :provides       ["@mui/styles"]
                                            :global-exports {"@mui/styles" 'MuiStyles}}
                                           {:file           "mui/mui-utils.inc.js"
                                            :file-min       "mui/mui-utils.min.inc.js"
                                            :provides       ["@mui/utils"]
                                            :global-exports {"@mui/utils" 'MuiUtils}}]
                                          (for [js-name material-names
                                                :let [fn (str "mui/mui-material-" (csk/->kebab-case js-name))
                                                      pn (str "@mui/material/" js-name)]]
                                            {:file           (str fn ".inc.js")
                                             :file-min       (str fn ".min.inc.js")
                                             :provides       [pn]
                                             :global-exports {pn (symbol (root-name "material" js-name))}})
                                          (for [js-name lab-names
                                                :let [fn (str "mui/mui-lab-" (csk/->kebab-case js-name))
                                                      pn (str "@mui/lab/" js-name)]]
                                            {:file           (str fn ".inc.js")
                                             :file-min       (str fn ".min.inc.js")
                                             :provides       [pn]
                                             :global-exports {pn (symbol (root-name "lab" js-name))}})
                                          (for [js-name core-names
                                                :let [fn (str "mui/mui-core-" (csk/->kebab-case js-name))
                                                      pn (str "@mui/core/" js-name)]]
                                            {:file           (str fn ".inc.js")
                                             :file-min       (str fn ".min.inc.js")
                                             :provides       [pn]
                                             :global-exports {pn (symbol (root-name "core" js-name))}})))
              :externs      ["mui/mui.ext.js"]}]
    (spit "./reagent-material-ui-js/deps.cljs" (with-out-str (pprint deps)))))

(defn write-core []
  (let [js-names (get-component-names "material")]
    (doseq [[js-ns js-name] js-names
            :when (not (contains? exclude-material (or js-name js-ns)))]
      (write-component-ns "material" js-ns js-name))
    (doseq [[js-ns js-name] (get-component-names "lab")
            :when (not (contains? exclude-material (or js-name js-ns)))]
      (write-component-ns "lab" js-ns js-name))
    (doseq [[js-ns js-name] (get-component-names "core")
            :when (not (contains? exclude-material (or js-name js-ns)))]
      (write-component-ns "core" js-ns js-name))
    (spit "./src/core/reagent_mui/components.cljs" (generate-common-material-ns-content js-names))))

(def ebnf "
<S> = (element | elementArray) <','> name
element = <'/*#__PURE__*/_jsx'> <'s'>? <'('> tag <','> props (<','> stringValue)? <')'>
elementArray = <'['> (element <','>?)* <']'>
<tag> = stringValue | 'React.Fragment'
props = <'{'> (prop <','>?)* <'}'>
<prop> = key <':'> value
<key> = #'[A-z0-9]*'
<value> = elementArray | stringValue
<stringValue> = <'\"'> #'[^\"]*' <'\"'>
<name> = <\"'\"> #\"[^']*\" <\"'\">
")

(def parser (insta/parser ebnf :auto-whitespace (insta/parser "whitespace = #'\\s+'")))

(defn element->react [element]
  (let [[type & more] element]
    (if (= :elementArray type)
      (mapv element->react more)
      (let [[tag proplist] more
            props (into {} (for [[k v] (partition 2 (rest proplist))]
                             [k (if (vector? v)
                                  (element->react v)
                                  v)]))
            children (get props "children" [])
            props' (dissoc props "children")]
        `(~'e ~tag ~@(when (seq props') [(symbol "#js")]) ~(not-empty props') ~@children)))))

(defn read-icon [path]
  (with-open [rdr (io/reader path)]
    (let [lines (drop-while #(not (str/starts-with? % "export default")) (line-seq rdr))
          s (str/join "" (drop-last 2 (drop 29 (str/join " " lines))))
          parsed (parser s)]
      (if (insta/failure? parsed)
        (throw (ex-info "Failed to parse" {:path   path
                                           :s      s
                                           :result parsed}))
        (element->react (first parsed))))))

(defn generate-icon-ns-content [js-name content]
  (let [clj-name (csk/->kebab-case js-name)]
    (str "(ns reagent-mui.icons." (icon-ns-name js-name) \newline
         "  \"Imports @mui/icons-material/" js-name " as a Reagent component.\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])" \newline
         "  (:require [react :as react]" \newline
         "            [\"@mui/material/SvgIcon\" :as SvgIcon]" \newline
         "            [reagent-mui.util]))" \newline \newline
         "(def " clj-name " (create-svg-icon " (pr-str content) \newline
         (str/join (repeat (+ 23 (count clj-name)) \space))
         \" js-name "\"))" \newline)))

(defn write-icon-ns [svg-name icon-path]
  (let [icon-content (read-icon icon-path)
        clj-path (str "./src/icons/reagent_mui/icons/" (csk/->snake_case (icon-ns-name svg-name)) ".cljs")
        ns-content (generate-icon-ns-content svg-name icon-content)]
    (spit clj-path ns-content)))

(defn write-icons [^String mui-path]
  (let [f (File. mui-path)
        filenames (seq (.list f))
        js-names (sort (for [filename filenames
                              :let [[_ js-name :as matches?] (re-matches #"([A-z0-9_].*)\.js" filename)]
                              :when (and matches?
                                         (not= "index" js-name))]
                          js-name))]
    (doseq [js-name js-names]
      (write-icon-ns js-name (str mui-path "/" js-name ".js")))))

(defn color->string [[js-name values]]
  (let [clj-name (csk/->kebab-case js-name)
        indent (str/join (repeat (+ 7 (count clj-name)) \space))]
    (str "(def " clj-name " {"
         (str/join (str \newline indent)
                   (for [[key value] values
                         :let [num-key? (contains? #{\0 \1 \2 \3 \4 \5 \6 \7 \8 \9} (first key))]]
                     (str (when-not num-key?
                            \:)
                          key
                          (when num-key? (str/join (repeat (- 5 (count key)) \space)))
                          \space \" value \")))
         "})" \newline)))

(defn generate-color-ns-content [colors]
  (str "(ns reagent-mui.colors" \newline
       "  \"Imports all colors from @mui/material/colors." \newline
       "   Original documentation is at https://mui.com/customization/color/ .\")" \newline \newline
       (str/join \newline (map color->string colors))))

(defn read-color-js-file [^File f]
  (with-open [rdr (io/reader f)]
    (doall
     (for [line (line-seq rdr)
           :let [[_ key color :as matches?] (re-matches #" *([0-9A]*|black|white): '([#0-9a-f]*)'," line)]
           :when matches?]
       [key color]))))

(defn write-colors [^String mui-path]
  (let [index (File. mui-path "index.js")
        js-names (with-open [rdr (io/reader index)]
                   (doall
                    (for [line (line-seq rdr)]
                      (let [[_ color] (re-matches #".*\{ default as (.*) \}.*" line)]
                        color))))
        colors (for [js-name js-names]
                 [js-name (read-color-js-file (File. mui-path (str js-name ".js")))])]
    (spit "./src/core/reagent_mui/colors.cljs" (generate-color-ns-content colors))))

(defn generate-ext-rows [names spaces]
  (str/join ",\n" (for [name names
                        :let [name (if (vector? name)
                                     (or (second name) (first name))
                                     name)]]
                    (str (apply str (repeat spaces " ")) name ": function () {}"))))

(defn generate-ext-file-content []
  (let [material-names (get-component-names "material")
        lab-names (get-component-names "lab")
        externs (edn/read-string (slurp (io/resource (resource-name "externs"))))]
    (str "var MuiMaterial = {\n"
         (generate-ext-rows material-names 2)
         ",\n  styles: {\n"
         (generate-ext-rows (get-in externs ["MuiMaterial" "styles"]) 4)
         "\n  },\n  utils: {\n"
         (generate-ext-rows (get-in externs ["MuiMaterial" "utils"]) 4)
         "\n  }\n};\n\n"
         "var MuiLab = {\n"
         (generate-ext-rows lab-names 2)
         "\n};\n\n"
         "var MuiCore = {\n"
         (generate-ext-rows (get externs "MuiCore") 2)
         "\n};\n\n"
         "var MuiStyles = {\n"
         (generate-ext-rows (get externs "MuiStyles") 2)
         "\n};\n\n"
         "var MuiUtils = {\n"
         (generate-ext-rows (get externs "MuiUtils") 2)
         "\n};\n")))

(defn write-ext-file []
  (spit "./reagent-material-ui-js/src/mui/mui.ext.js" (generate-ext-file-content)))

(defn entry-name [mui-ns js-ns]
  (str "mui-" mui-ns "-" (csk/->kebab-case js-ns)))

(defn generate-entry-file-content [mui-ns js-ns js-names]
  (if (= mui-ns "core")
    (str "export { default } from '@mui/core/" js-ns "'\n"
         "export * from '@mui/core/" js-ns "'")
    (str "export { " js-ns " as default" (apply str (interleave (repeat ", ") js-names)) " } from '@mui/" mui-ns "'")))

(defn generate-json-entry [mui-ns js-ns]
  (let [n (entry-name mui-ns js-ns)]
    (str "{\n    \"entry\": \"" n "\",\n"
         "    \"root\": \"" (root-name mui-ns js-ns) "\"\n"
         "  }")))

(defn write-ns-entry-files [mui-ns names]
  (let [grouped (group-by first names)]
    (doseq [[js-ns js-names] grouped]
      (let [js-names (remove nil? (map second js-names))
            filename (str "./reagent-material-ui-js/entries/" (entry-name mui-ns js-ns) ".js")]
        (spit filename (generate-entry-file-content mui-ns js-ns js-names))))))

(defn write-entry-json-file []
  (let [content (str "[\n  "
                     (str/join ", " (map (partial generate-json-entry "material") (get-distinct-names "material" "additional-material")))
                     ", "
                     (str/join ", " (map (partial generate-json-entry "lab") (get-distinct-names "lab")))
                     "\n]")]
    (spit "./reagent-material-ui-js/entries/components.json" content))
  (let [content (str "[\n  "
                     (str/join ", " (map (partial generate-json-entry "core") (get-distinct-names "core" "additional-core")))
                     "\n]")]
    (spit "./reagent-material-ui-js/entries/coreComponents.json" content))
  )

(defn write-entry-files []
  (let [material-names (get-component-names "material" "additional-material")
        lab-names (get-component-names "lab")
        core-names (get-component-names "core" "additional-core")]
    (write-ns-entry-files "material" material-names)
    (write-ns-entry-files "lab" lab-names)
    (write-ns-entry-files "core" core-names)
    (write-entry-json-file)))
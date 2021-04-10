(ns reagent-material-ui.scripts
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :refer [pprint]]
            [camel-snake-kebab.core :as csk]
            [clojure.java.io :as io]
            [instaparse.core :as insta])
  (:import (java.io File)))

;; (write-icons "/Users/arttuka/workspace/arttuka/material-ui/packages/material-ui-icons/src")

(def exclude-clj #{"comment" "compare" "filter" "list" "loop" "map" "print" "remove" "repeat" "shuffle" "sort" "update"})
(def exclude-core #{"TextField" "TextareaAutosize" "createFilterOptions"})
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

(defn icon-ns-name [js-name]
  (let [clj-name (csk/->kebab-case js-name)]
    (if (contains? js-keyword-icons clj-name)
      (str clj-name "-icon")
      clj-name)))

(defn mui-name [js-ns js-name]
  (str "(.-" (or js-name "default") " Mui" js-ns ")"))

(defn root-name [mui-ns js-ns]
  (str (if (= "core" mui-ns) "MaterialUI" "MaterialUILab") (csk/->PascalCase js-ns)))

(defn generate-component-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-material-ui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @material-ui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a Reagent component." \newline
         "   Original documentation is at https://material-ui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-material-ui.util :refer [adapt-react-class]]" \newline
         "            [\"@material-ui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (adapt-react-class " (mui-name js-ns js-name) " \"mui-" clj-name "\"))" \newline)))

(defn generate-hook-ns-content [mui-ns js-ns js-name]
  (let [clj-name (csk/->kebab-case (or js-name js-ns))]
    (str "(ns reagent-material-ui." mui-ns "." (component-ns-name js-ns js-name) \newline
         "  \"Imports @material-ui/" mui-ns "/" js-ns (when js-name (str "/" js-name)) " as a React hook." \newline
         "   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks" \newline
         "   Original documentation is at https://material-ui.com/api/" clj-name "/ .\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require [reagent-material-ui.util :refer [wrap-js-function]]" \newline
         "            [\"@material-ui/" mui-ns "/" js-ns "\" :as Mui" js-ns "]))" \newline \newline
         "(def " clj-name " (wrap-js-function " (mui-name js-ns js-name) "))" \newline)))

(defn write-component-ns [mui-ns js-ns js-name]
  (let [hook? (str/starts-with? (or js-name js-ns) "use")
        content ((if hook? generate-hook-ns-content generate-component-ns-content)
                 mui-ns js-ns js-name)
        path (str "./src/core/reagent_material_ui/" mui-ns "/" (csk/->snake_case (component-ns-name js-ns js-name)) ".cljs")]
    (spit path content)))

(defn generate-common-core-ns-content [js-names]
  (let [clj-names (for [[js-ns js-name] js-names]
                    (csk/->kebab-case (or js-name js-ns)))]
    (str "(ns reagent-material-ui.components" \newline
         "  \"Imports all components from @material-ui/core as Reagent components." \newline
         "   Original documentation is at https://material-ui.com/api/ .\"" \newline
         "  (:refer-clojure :exclude [" (str/join " " (keep exclude-clj clj-names)) "])" \newline
         "  (:require "
         (str/join "\n            " (for [clj-name clj-names]
                                      (str "reagent-material-ui.core." (component-ns-name clj-name nil))))
         "))" \newline \newline
         (str/join \newline (for [clj-name clj-names]
                              (str "(def " clj-name " reagent-material-ui.core." (component-ns-name clj-name nil) "/" clj-name ")")))
         \newline)))

(defn get-component-names
  ([]
   (get-component-names (resource-name "components")))
  ([file]
   (for [elem (edn/read-string (slurp (io/resource file)))]
     (if (vector? elem) elem [elem nil]))))

(defn write-deps-file []
  (let [core-names (distinct (map first (get-component-names)))
        lab-names (distinct (map first (get-component-names (resource-name "lab"))))
        deps {:foreign-libs (vec (concat [{:file           "material-ui/material-ui.inc.js"
                                           :file-min       "material-ui/material-ui.min.inc.js"
                                           :provides       ["@material-ui/core"
                                                            "@material-ui/core/styles"
                                                            "@material-ui/core/utils"]
                                           :global-exports (sorted-map "@material-ui/core" 'MaterialUI
                                                                       "@material-ui/core/styles" 'MaterialUI
                                                                       "@material-ui/core/utils" 'MaterialUI)
                                           :requires       ["react" "react-dom" "@material-ui/styles" "@material-ui/utils"]}
                                          {:file           "material-ui/material-ui-lab.inc.js"
                                           :file-min       "material-ui/material-ui-lab.min.inc.js"
                                           :provides       ["@material-ui/lab"]
                                           :global-exports {"@material-ui/lab" 'MaterialUILab}
                                           :requires       ["react" "react-dom" "@material-ui/core" "@material-ui/utils"]}
                                          #_{:file           "material-ui/material-ui-pickers.inc.js"
                                           :file-min       "material-ui/material-ui-pickers.min.inc.js"
                                           :provides       ["@material-ui/pickers"]
                                           :global-exports {"@material-ui/pickers" 'MaterialUIPickers}
                                           :requires       ["react" "react-dom" "@material-ui/core" "@material-ui/styles"]}
                                          {:file           "material-ui/material-ui-styles.inc.js"
                                           :file-min       "material-ui/material-ui-styles.min.inc.js"
                                           :provides       ["@material-ui/styles"]
                                           :global-exports {"@material-ui/styles" 'MaterialUIStyles}
                                           :requires       ["react" "react-dom" "@material-ui/utils"]}
                                          {:file           "material-ui/material-ui-utils.inc.js"
                                           :file-min       "material-ui/material-ui-utils.min.inc.js"
                                           :provides       ["@material-ui/utils"]
                                           :global-exports {"@material-ui/utils" 'MaterialUIUtils}
                                           :requires       ["react" "react-dom"]}]
                                         (for [js-name core-names
                                               :let [fn (str "material-ui/material-ui-" (csk/->kebab-case js-name))
                                                     pn (str "@material-ui/core/" js-name)]]
                                           {:file           (str fn ".inc.js")
                                            :file-min       (str fn ".min.inc.js")
                                            :provides       [pn]
                                            :global-exports {pn (symbol (root-name "core" js-name))}
                                            :requires       ["@material-ui/core"]})
                                         (for [js-name lab-names
                                               :let [fn (str "material-ui/material-ui-lab-" (csk/->kebab-case js-name))
                                                     pn (str "@material-ui/lab/" js-name)]]
                                           {:file           (str fn ".inc.js")
                                            :file-min       (str fn ".min.inc.js")
                                            :provides       [pn]
                                            :global-exports {pn (symbol (root-name "lab" js-name))}
                                            :requires       ["@material-ui/lab"]})))
              :externs      ["material-ui/material-ui.ext.js"]}]
    (spit "./reagent-material-ui-js/deps.cljs" (with-out-str (pprint deps)))))

(defn write-core []
  (let [js-names (get-component-names)]
    (doseq [[js-ns js-name] js-names
            :when (not (contains? exclude-core (or js-name js-ns)))]
      (write-component-ns "core" js-ns js-name))
    (doseq [[js-ns js-name] (get-component-names (resource-name "lab"))
            :when (not (contains? exclude-core (or js-name js-ns)))]
      (write-component-ns "lab" js-ns js-name))
    (spit "./src/core/reagent_material_ui/components.cljs" (generate-common-core-ns-content js-names))))

(def ebnf "
S = element <','>?
<element> = empty-element | nonempty-element
nonempty-element = <'<'> tag proplist <'>'> element* <'</'> <tag> <'>'>
empty-element = <'<'> tag proplist <'/>'>
proplist = propvalue*
<propvalue> = prop <'=\"'> value <'\"'>
<value> = #'[^\"]*'
<prop> = 'clipRule'|'cx'|'cy'|'d'|'fill'|'fillOpacity'|'fillRule'|'id'|'opacity'|'r'|'transform'
<tag> = 'React.Fragment'|'circle'|'defs'|'g'|'path'
")

(def parser (insta/parser ebnf :auto-whitespace (insta/parser "whitespace = #'\\s+'")))

(defn element->react [element]
  (let [[type tag proplist & children] element
        react-tag (if (= "React.Fragment" tag)
                    'react/Fragment
                    tag)
        props (some->> (next proplist)
                       (apply hash-map))
        parsed-children (for [child children]
                          (if (vector? child)
                            (element->react child)
                            (throw (ex-info "Illegal child" {:element element
                                                             :child   child}))))]
    `(~'e ~react-tag ~@(when props [(symbol "#js")]) ~props ~@parsed-children)))

(defn read-icon [path]
  (with-open [rdr (io/reader path)]
    (let [jsx (nth (line-seq rdr) 4)
          parsed (parser jsx)]
      (if (insta/failure? parsed)
        (throw (ex-info "Failed to parse" {:path   path
                                           :jsx    jsx
                                           :result parsed}))
        (element->react (second parsed))))))

(defn generate-icon-ns-content [js-name content]
  (let [clj-name (csk/->kebab-case js-name)]
    (str "(ns reagent-material-ui.icons." (icon-ns-name js-name) \newline
         "  \"Imports @material-ui/icons/" js-name " as a Reagent component.\"" \newline
         (when (contains? exclude-clj clj-name)
           (str "  (:refer-clojure :exclude [" clj-name "])" \newline))
         "  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])" \newline
         "  (:require [react :as react]" \newline
         "            [\"@material-ui/core/SvgIcon\" :as SvgIcon]" \newline
         "            [reagent-material-ui.util]))" \newline \newline
         "(def " clj-name " (create-svg-icon " (pr-str content) \newline
         (str/join (repeat (+ 23 (count clj-name)) \space))
         \" js-name "\"))" \newline)))

(defn write-icon-ns [js-name icon-path]
  (let [icon-content (read-icon icon-path)
        clj-path (str "./src/icons/reagent_material_ui/icons/" (csk/->snake_case (icon-ns-name js-name)) ".cljs")
        ns-content (generate-icon-ns-content js-name icon-content)]
    (spit clj-path ns-content)))

(defn write-icons [^String mui-path]
  (let [f (File. mui-path)
        filenames (seq (.list f))
        js-names (sort (for [filename filenames
                             :let [[_ js-name :as matches?] (re-matches #"([A-Z].*)\.js" filename)]
                             :when matches?]
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
  (str "(ns reagent-material-ui.colors" \newline
       "  \"Imports all colors from @material-ui/core/colors." \newline
       "   Original documentation is at https://material-ui.com/customization/color/ .\")" \newline \newline
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
    (spit "./src/core/reagent_material_ui/colors.cljs" (generate-color-ns-content colors))))

(defn generate-ext-rows [names spaces]
  (str/join ",\n" (for [name names
                        :let [name (if (vector? name)
                                     (or (second name) (first name))
                                     name)]]
                    (str (apply str (repeat spaces " ")) name ": function () {}"))))

(defn generate-ext-file-content []
  (let [core-names (get-component-names)
        lab-names (get-component-names (resource-name "lab"))
        externs (edn/read-string (slurp (io/resource (resource-name "externs"))))]
    (str "var MaterialUI = {\n"
         (generate-ext-rows core-names 2)
         ",\n  styles: {\n"
         (generate-ext-rows (get-in externs ["MaterialUI" "styles"]) 4)
         "\n  },\n  utils: {\n"
         (generate-ext-rows (get-in externs ["MaterialUI" "utils"]) 4)
         "\n  }\n};\n\n"
         "var MaterialUILab = {\n"
         (generate-ext-rows lab-names 2)
         "\n};\n\n"
         (when-let [pickers (get externs "MaterialUIPickers")]
           (str "var MaterialUIPickers = {\n"
                (generate-ext-rows pickers 2)
                "\n};\n\n"))
         "var MaterialUIStyles = {\n"
         (generate-ext-rows (get externs "MaterialUIStyles") 2)
         "\n};\n\n"
         "var MaterialUIUtils = {\n"
         (generate-ext-rows (get externs "MaterialUIUtils") 2)
         "\n};\n")))

(defn write-ext-file []
  (spit "./reagent-material-ui-js/src/material-ui/material-ui.ext.js" (generate-ext-file-content)))

(defn entry-name [mui-ns js-ns]
  (str "material-ui-" (if (= "core" mui-ns) "" "lab-") (csk/->kebab-case js-ns)))

(defn generate-entry-file-content [mui-ns js-ns js-names]
  (str "export { " js-ns " as default" (apply str (interleave (repeat ", ") js-names)) " } from '@material-ui/" mui-ns "'"))

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

(defn write-entry-json-file [core-names lab-names]
  (let [content (str "[\n  "
                     (str/join ", " (map (partial generate-json-entry "core") (distinct (map first core-names))))
                     ", "
                     (str/join ", " (map (partial generate-json-entry "lab") (distinct (map first lab-names))))
                     "\n]")]
    (spit "./reagent-material-ui-js/entries/components.json" content)))

(defn write-entry-files []
  (let [core-names (get-component-names)
        lab-names (get-component-names (resource-name "lab"))]
    (write-ns-entry-files "core" core-names)
    (write-ns-entry-files "lab" lab-names)
    (write-entry-json-file core-names lab-names)))
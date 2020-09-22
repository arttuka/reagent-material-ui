(defproject arttuka/reagent-material-ui "4.11.0-3"
  :description "Reagent wrapper library for Material UI v4"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [reagent "0.10.0"]
                 [com.andrewmcveigh/cljs-time "0.5.2"]
                 [camel-snake-kebab "0.4.1"]]
  :plugins [[lein-cljfmt "0.6.8"]]
  :source-paths ["src/core" "src/icons" "src/generated"]
  :resource-paths ["deps.cljs"]
  :profiles {:dev      {:source-paths   ["dev"]
                        :test-paths     ["test"]
                        :resource-paths ["target" "dev-resources"]}
             :provided {:dependencies [[org.clojure/clojurescript "1.10.773"]
                                       [prismatic/dommy "1.1.0"]]}}
  :clean-targets ^{:protect false} ["target" ".shadow-cljs"]
  :cljfmt {:indents {forward-ref [[:inner 0]]}})

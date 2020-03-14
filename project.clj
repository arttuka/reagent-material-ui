(defproject arttuka/reagent-material-ui "4.8.3-1"
  :description "Reagent wrapper library for Material UI v4"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.597"]
                 [reagent "0.10.0"]
                 [cljsjs/material-ui "4.8.3-0"]
                 [cljsjs/material-ui-pickers "3.2.7-0"]
                 [com.andrewmcveigh/cljs-time "0.5.2"]
                 [camel-snake-kebab "0.4.1"]]
  :plugins [[lein-cljfmt "0.6.6"]]
  :source-paths ["src/core" "src/icons"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.3"]
                                    [prismatic/dommy "1.1.0"]
                                    [com.bhauman/rebel-readline-cljs "0.1.4"]
                                    [cider/piggieback "0.4.2"]]
                   :source-paths   ["dev"]
                   :test-paths     ["test"]
                   :resource-paths ["target"]}
             :figwheel {:source-paths ^:replace ["src/core" "dev"]}}
  :clean-targets ^{:protect false} ["target"]
  :aliases {"figwheel" ["with-profile" "+figwheel" "trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "test"     ["run" "-m" "figwheel.main" "-co" "test.cljs.edn" "-m" reagent-material-ui.test-runner]}
  :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}
  :cljfmt {:indents {forward-ref [[:inner 0]]}})

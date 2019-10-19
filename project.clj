(defproject arttuka/reagent-material-ui "4.5.1-0-SNAPSHOT"
  :description "Reagent wrapper library for Material UI v4"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [reagent "0.9.0-rc2"]
                 [cljsjs/material-ui "4.5.1-0"]
                 [camel-snake-kebab "0.4.0"]]
  :plugins [[lein-cljfmt "0.6.4"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.3"]
                                    [prismatic/dommy "1.1.0"]
                                    [com.bhauman/rebel-readline-cljs "0.1.4"]
                                    [cider/piggieback "0.4.1"]]
                   :test-paths     ["test"]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target"]
  :aliases {"figwheel" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "test"     ["run" "-m" "figwheel.main" "-co" "test.cljs.edn" "-m" reagent-material-ui.test-runner]}
  :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]})

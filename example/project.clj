(defproject reagent-material-ui-example "1.0.0"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [reagent "0.10.0"]
                 [arttuka/reagent-material-ui "4.11.0-0"]]
  :source-paths ["src/common"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.4" :exclusions [org.clojure/clojurescript]]]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target" "resources/shadow-cljs/js"]
  :aliases {"run" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]})

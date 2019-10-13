(defproject reagent-material-ui-example "1.0.0"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [reagent "0.9.0-rc1"]
                 [arttuka/reagent-material-ui "4.4.3-0"]]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.3" :exclusions [org.clojure/clojurescript]]]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target"]
  :aliases {"run" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]})

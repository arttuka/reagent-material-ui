(defproject reagent-material-ui-example "1.0.0"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [arttuka/reagent-material-ui "4.11.0-4"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.11" :exclusions [org.clojure/clojurescript]]]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target" "resources/public/js" ".shadow-cljs"]
  :aliases {"run" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]})

(defproject reagent-material-ui-example "1.0.0"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60"]
                 [arttuka/reagent-material-ui "5.11.8-0"
                 #_#_ :exclusions [arttuka/reagent-material-ui-js]]
                 [cljsjs/react "17.0.2-0"]
                 [cljsjs/react-dom "17.0.2-0"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.18" :exclusions [org.clojure/clojurescript]]]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target" "resources/public/js" ".shadow-cljs"]
  :aliases {"run:dev" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "run:npm" ["trampoline" "run" "-m" "figwheel.main" "-b" "npm" "-r"]})

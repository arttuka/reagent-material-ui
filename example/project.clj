(defproject reagent-material-ui-example "1.0.0"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.773"]
                 [arttuka/reagent-material-ui "5.0.0-alpha.27-1"
                  #_#_ :exclusions [cljsjs/react cljsjs/react-dom cljsjs/react-dom-server arttuka/reagent-material-ui-js]]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies   [[com.bhauman/figwheel-main "0.2.12" :exclusions [org.clojure/clojurescript]]]
                   :resource-paths ["target"]}}
  :clean-targets ^{:protect false} ["target" "resources/public/js" ".shadow-cljs"]
  :aliases {"run:dev" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]
            "run:npm" ["trampoline" "run" "-m" "figwheel.main" "-b" "npm" "-r"]})

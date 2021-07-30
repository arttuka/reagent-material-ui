(defproject arttuka/reagent-material-ui "5.0.0-beta.2-0"
  :description "Reagent wrapper library for Material UI v5 alpha"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [reagent "1.1.0"]
                 [com.andrewmcveigh/cljs-time "0.5.2"]
                 [camel-snake-kebab "0.4.2"]
                 [arttuka/reagent-material-ui-js "5.0.0-beta.2-0"]]
  :plugins [[lein-cljfmt "0.8.0"]
            [lein-cljsbuild "1.1.8"]
            [lein-doo "0.1.11"]]
  :source-paths ["src/core" "src/icons"]
  :resource-paths ["deps.cljs"]
  :profiles {:dev      {:test-paths     ["test"]
                        :resource-paths ["target" "dev-resources"]}
             :provided {:dependencies [[org.clojure/clojurescript "1.10.879"]
                                       [cljsjs/react "17.0.2-0"]
                                       [cljsjs/react-dom "17.0.2-0"]
                                       [prismatic/dommy "1.1.0"]]}}
  :clean-targets ^{:protect false} ["target" ".shadow-cljs"]
  :cljfmt {:indents {forward-ref [[:inner 0]]}
           :paths   ["src/core"]}
  :cljsbuild {:builds [{:id           "test"
                        :source-paths ["src/core" "test"]
                        :compiler     {:output-to     "target/public/js/test-main.js"
                                       :output-dir    "target/public/js/out"
                                       :asset-path    "js/out"
                                       :main          reagent-material-ui.test-runner
                                       :optimizations :none
                                       :npm-deps      false}}
                       {:id           "test-adv"
                        :source-paths ["src/core" "test"]
                        :compiler     {:output-to     "target/public/js/test-main.js"
                                       :output-dir    "target/public/js/out"
                                       :main          reagent-material-ui.test-runner
                                       :optimizations :advanced
                                       :npm-deps      false}}]}
  :doo {:paths {:karma "./node_modules/karma/bin/karma"}}
  :aliases {"test"         ["do" ["clean"] ["doo:test"] ["clean"] ["doo:test-adv"]]
            "doo:test"     ["doo" "chrome-headless" "test" "once"]
            "doo:test-adv" ["doo" "chrome-headless" "test-adv" "once"]}
  :deploy-repositories [["releases" {:url           "https://repo.clojars.org"
                                     :sign-releases false
                                     :username      :env/clojars_username
                                     :password      :env/clojars_password}]])

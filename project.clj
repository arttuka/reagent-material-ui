(defproject arttuka/reagent-material-ui "5.0.0-alpha.20-0"
  :description "Reagent wrapper library for Material UI v5 alpha"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [reagent "1.0.0"]
                 [com.andrewmcveigh/cljs-time "0.5.2"]
                 [camel-snake-kebab "0.4.2"]]
  :plugins [[lein-cljfmt "0.7.0"]]
  :source-paths ["src/core" "src/icons" "src/generated"]
  :resource-paths ["deps.cljs"]
  :profiles {:dev      {:source-paths   ["dev"]
                        :test-paths     ["test"]
                        :resource-paths ["target" "dev-resources"]}
             :provided {:dependencies [[org.clojure/clojurescript "1.10.773"]
                                       [prismatic/dommy "1.1.0"]]}}
  :clean-targets ^{:protect false} ["target" ".shadow-cljs"]
  :cljfmt {:indents {forward-ref [[:inner 0]]}
           :paths   ["src/core"]}
  :deploy-repositories [["releases" {:url           "https://repo.clojars.org"
                                     :sign-releases false
                                     :username      :env/clojars_username
                                     :password      :env/clojars_password}]])

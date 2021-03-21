(defproject arttuka/reagent-material-ui-js "5.0.0-alpha.27-1"
  :description "Packaged Javascript files for reagent-material-ui"
  :url "https://github.com/arttuka/reagent-material-ui"
  :license {:name "Eclipse Public License 2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :source-paths ["src"]
  :resource-paths ["deps.cljs"]
  :deploy-repositories [["releases" {:url           "https://repo.clojars.org"
                                     :sign-releases false
                                     :username      :env/clojars_username
                                     :password      :env/clojars_password}]])

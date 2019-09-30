(ns reagent-material-ui.test-runner
  (:require [figwheel.main.testing :refer-macros [run-tests]]
            [reagent-material-ui.styles-test]))

(defn -main [& args]
  (run-tests))

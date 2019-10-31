(ns reagent-material-ui.test-runner
  (:require [figwheel.main.testing :refer-macros [run-tests]]
            [reagent-material-ui.reagent-test]
            [reagent-material-ui.styles-test]
            [reagent-material-ui.util-test]))

(defn -main [& args]
  (run-tests))

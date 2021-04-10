(ns reagent-material-ui.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [reagent-material-ui.cljsjs-test]))

(doo-tests 'reagent-material-ui.cljsjs-test)

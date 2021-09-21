(ns reagent-mui.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [reagent-mui.cljsjs-test]))

(doo-tests 'reagent-mui.cljsjs-test)

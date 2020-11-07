(ns reagent-material-ui.lab.use-tab-context
  "Imports @material-ui/lab/TabContext/useTabContext as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-tab-context/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/lab/TabContext" :as MuiTabContext]))

(def use-tab-context (wrap-js-function (.-useTabContext MuiTabContext)))

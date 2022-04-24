(ns reagent-mui.lab.use-tab-context
  "Imports @mui/lab/TabContext/useTabContext as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/material-ui/api/use-tab-context/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/lab/TabContext" :as MuiTabContext]))

(def use-tab-context (wrap-js-function MuiTabContext/useTabContext))

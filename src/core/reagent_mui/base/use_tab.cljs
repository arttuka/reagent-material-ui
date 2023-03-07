(ns reagent-mui.base.use-tab
  "Imports @mui/base/useTab as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-tab/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useTab" :as MuiuseTab]))

(def use-tab (wrap-js-function (.-default MuiuseTab)))

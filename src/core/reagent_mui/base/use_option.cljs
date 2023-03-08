(ns reagent-mui.base.use-option
  "Imports @mui/base/useOption as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-option/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useOption" :as MuiuseOption]))

(def use-option (wrap-js-function (.-default MuiuseOption)))

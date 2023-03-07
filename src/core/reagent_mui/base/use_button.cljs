(ns reagent-mui.base.use-button
  "Imports @mui/base/useButton as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-button/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useButton" :as MuiuseButton]))

(def use-button (wrap-js-function (.-default MuiuseButton)))

(ns reagent-mui.base.use-button
  "Imports @mui/base/ButtonUnstyled/useButton as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-button/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/ButtonUnstyled" :as MuiButtonUnstyled]))

(def use-button (wrap-js-function (.-useButton MuiButtonUnstyled)))

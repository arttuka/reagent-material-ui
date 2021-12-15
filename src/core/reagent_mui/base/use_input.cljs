(ns reagent-mui.base.use-input
  "Imports @mui/base/InputUnstyled/useInput as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-input/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/InputUnstyled" :as MuiInputUnstyled]))

(def use-input (wrap-js-function (.-useInput MuiInputUnstyled)))

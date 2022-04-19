(ns reagent-mui.base.use-select
  "Imports @mui/base/SelectUnstyled/useSelect as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-select/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/SelectUnstyled" :as MuiSelectUnstyled]))

(def use-select (wrap-js-function (.-useSelect MuiSelectUnstyled)))

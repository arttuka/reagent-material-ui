(ns reagent-mui.base.use-tab-panel
  "Imports @mui/base/TabPanelUnstyled/useTabPanel as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-tab-panel/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/TabPanelUnstyled" :as MuiTabPanelUnstyled]))

(def use-tab-panel (wrap-js-function (.-useTabPanel MuiTabPanelUnstyled)))

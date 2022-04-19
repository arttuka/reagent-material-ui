(ns reagent-mui.base.use-tabs
  "Imports @mui/base/TabsUnstyled/useTabs as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-tabs/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/TabsUnstyled" :as MuiTabsUnstyled]))

(def use-tabs (wrap-js-function (.-useTabs MuiTabsUnstyled)))

(ns reagent-mui.base.use-tabs-list
  "Imports @mui/base/TabsListUnstyled/useTabsList as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-tabs-list/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/TabsListUnstyled" :as MuiTabsListUnstyled]))

(def use-tabs-list (wrap-js-function MuiTabsListUnstyled/useTabsList))

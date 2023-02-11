(ns reagent-mui.base.tabs-list-unstyled
  "Imports @mui/base/TabsListUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/tabs-list-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/TabsListUnstyled" :as MuiTabsListUnstyled]))

(def tabs-list-unstyled (r/adapt-react-class (.-default MuiTabsListUnstyled)))

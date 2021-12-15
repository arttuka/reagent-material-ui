(ns reagent-mui.base.tabs-list-unstyled
  "Imports @mui/base/TabsListUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/tabs-list-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TabsListUnstyled" :as MuiTabsListUnstyled]))

(def tabs-list-unstyled (adapt-react-class (.-default MuiTabsListUnstyled) "mui-tabs-list-unstyled"))

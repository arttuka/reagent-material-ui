(ns reagent-mui.base.tabs-unstyled
  "Imports @mui/base/TabsUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/tabs-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/TabsUnstyled" :as MuiTabsUnstyled]))

(def tabs-unstyled (adapt-react-class (.-default MuiTabsUnstyled) "mui-tabs-unstyled"))

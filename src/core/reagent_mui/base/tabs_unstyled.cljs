(ns reagent-mui.base.tabs-unstyled
  "Imports @mui/base/TabsUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/tabs-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/TabsUnstyled" :as MuiTabsUnstyled]))

(def tabs-unstyled (r/adapt-react-class (.-default MuiTabsUnstyled)))

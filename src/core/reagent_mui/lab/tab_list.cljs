(ns reagent-mui.lab.tab-list
  "Imports @mui/lab/TabList as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-list/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TabList" :as MuiTabList]))

(def tab-list (adapt-react-class (.-default MuiTabList) "mui-tab-list"))

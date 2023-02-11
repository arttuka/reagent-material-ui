(ns reagent-mui.lab.tab-list
  "Imports @mui/lab/TabList as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-list/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TabList" :as MuiTabList]))

(def tab-list (r/adapt-react-class (.-default MuiTabList)))

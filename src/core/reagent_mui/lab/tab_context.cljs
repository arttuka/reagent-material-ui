(ns reagent-mui.lab.tab-context
  "Imports @mui/lab/TabContext as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-context/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TabContext" :as MuiTabContext]))

(def tab-context (adapt-react-class (.-default MuiTabContext) "mui-tab-context"))

(ns reagent-mui.lab.tab-context
  "Imports @mui/lab/TabContext as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-context/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TabContext" :as MuiTabContext]))

(def tab-context (r/adapt-react-class (.-default MuiTabContext)))

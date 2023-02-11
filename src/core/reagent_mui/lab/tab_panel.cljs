(ns reagent-mui.lab.tab-panel
  "Imports @mui/lab/TabPanel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-panel/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TabPanel" :as MuiTabPanel]))

(def tab-panel (r/adapt-react-class (.-default MuiTabPanel)))

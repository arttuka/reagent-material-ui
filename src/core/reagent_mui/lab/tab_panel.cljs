(ns reagent-mui.lab.tab-panel
  "Imports @mui/lab/TabPanel as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-panel/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TabPanel" :as MuiTabPanel]))

(def tab-panel (adapt-react-class (.-default MuiTabPanel) "mui-tab-panel"))

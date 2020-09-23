(ns reagent-material-ui.lab.tab-panel
  "Imports @material-ui/lab/TabPanel as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab-panel/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TabPanel" :as MuiTabPanel]))

(def tab-panel (adapt-react-class (or (.-default MuiTabPanel) (.-TabPanel MuiTabPanel)) "mui-tab-panel"))

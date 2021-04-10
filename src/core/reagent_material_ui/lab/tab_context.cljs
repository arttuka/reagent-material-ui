(ns reagent-material-ui.lab.tab-context
  "Imports @material-ui/lab/TabContext as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab-context/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TabContext" :as MuiTabContext]))

(def tab-context (adapt-react-class (.-default MuiTabContext) "mui-tab-context"))

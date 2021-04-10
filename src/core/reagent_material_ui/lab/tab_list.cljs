(ns reagent-material-ui.lab.tab-list
  "Imports @material-ui/lab/TabList as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab-list/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TabList" :as MuiTabList]))

(def tab-list (adapt-react-class (.-default MuiTabList) "mui-tab-list"))

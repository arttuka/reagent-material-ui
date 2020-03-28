(ns reagent-material-ui.core.tab
  "Imports @material-ui/core/Tab as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Tab" :as Tab]))

(def tab (adapt-react-class (or (.-default Tab) (.-Tab Tab)) "mui-tab"))

(ns reagent-material-ui.core.tab
  "Imports @material-ui/core/Tab as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def tab (r/adapt-react-class (.-Tab js/MaterialUI)))

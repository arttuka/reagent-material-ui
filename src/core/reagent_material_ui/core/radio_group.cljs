(ns reagent-material-ui.core.radio-group
  "Imports @material-ui/core/RadioGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/radio-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def radio-group (adapt-react-class (.-RadioGroup js/MaterialUI) "mui-radio-group"))

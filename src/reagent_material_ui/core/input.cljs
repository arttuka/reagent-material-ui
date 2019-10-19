(ns reagent-material-ui.core.input
  "Imports @material-ui/core/Input as a Reagent component.
   Original documentation is at https://material-ui.com/api/input/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def input (adapt-react-class (.-Input js/MaterialUI) "mui-input"))

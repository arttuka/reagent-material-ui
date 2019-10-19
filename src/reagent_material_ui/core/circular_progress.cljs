(ns reagent-material-ui.core.circular-progress
  "Imports @material-ui/core/CircularProgress as a Reagent component.
   Original documentation is at https://material-ui.com/api/circular-progress/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def circular-progress (adapt-react-class (.-CircularProgress js/MaterialUI) "mui-circular-progress"))

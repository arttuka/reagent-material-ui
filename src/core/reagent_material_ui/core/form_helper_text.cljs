(ns reagent-material-ui.core.form-helper-text
  "Imports @material-ui/core/FormHelperText as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-helper-text/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def form-helper-text (adapt-react-class (.-FormHelperText js/MaterialUI) "mui-form-helper-text"))

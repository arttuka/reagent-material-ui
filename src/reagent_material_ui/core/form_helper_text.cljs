(ns reagent-material-ui.core.form-helper-text
  "Imports @material-ui/core/FormHelperText as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-helper-text/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def form-helper-text (r/adapt-react-class (.-FormHelperText js/MaterialUI)))

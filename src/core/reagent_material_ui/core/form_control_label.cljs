(ns reagent-material-ui.core.form-control-label
  "Imports @material-ui/core/FormControlLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-control-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/FormControlLabel" :as MuiFormControlLabel]))

(def form-control-label (adapt-react-class (.-default MuiFormControlLabel) "mui-form-control-label"))

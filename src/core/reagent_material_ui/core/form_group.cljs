(ns reagent-material-ui.core.form-group
  "Imports @material-ui/core/FormGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/FormGroup" :as MuiFormGroup]))

(def form-group (adapt-react-class (.-default MuiFormGroup) "mui-form-group"))

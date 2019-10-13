(ns reagent-material-ui.core.form-group
  "Imports @material-ui/core/FormGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-group/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def form-group (r/adapt-react-class (.-FormGroup js/MaterialUI)))

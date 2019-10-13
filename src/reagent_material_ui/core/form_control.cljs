(ns reagent-material-ui.core.form-control
  "Imports @material-ui/core/FormControl as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-control/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def form-control (r/adapt-react-class (.-FormControl js/MaterialUI)))

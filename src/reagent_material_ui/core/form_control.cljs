(ns reagent-material-ui.core.form-control
  "Imports @material-ui/core/FormControl as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-control/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def form-control (adapt-react-class (.-FormControl js/MaterialUI) "mui-form-control"))

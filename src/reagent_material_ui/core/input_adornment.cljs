(ns reagent-material-ui.core.input-adornment
  "Imports @material-ui/core/InputAdornment as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-adornment/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def input-adornment (r/adapt-react-class (.-InputAdornment js/MaterialUI)))

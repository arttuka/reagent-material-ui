(ns reagent-material-ui.core.checkbox
  "Imports @material-ui/core/Checkbox as a Reagent component.
   Original documentation is at https://material-ui.com/api/checkbox/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def checkbox (r/adapt-react-class (.-Checkbox js/MaterialUI)))

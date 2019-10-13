(ns reagent-material-ui.core.slider
  "Imports @material-ui/core/Slider as a Reagent component.
   Original documentation is at https://material-ui.com/api/slider/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def slider (r/adapt-react-class (.-Slider js/MaterialUI)))

(ns reagent-material-ui.core.slide
  "Imports @material-ui/core/Slide as a Reagent component.
   Original documentation is at https://material-ui.com/api/slide/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def slide (r/adapt-react-class (.-Slide js/MaterialUI)))

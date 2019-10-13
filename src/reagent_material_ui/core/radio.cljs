(ns reagent-material-ui.core.radio
  "Imports @material-ui/core/Radio as a Reagent component.
   Original documentation is at https://material-ui.com/api/radio/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def radio (r/adapt-react-class (.-Radio js/MaterialUI)))

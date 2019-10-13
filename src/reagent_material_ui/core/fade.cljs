(ns reagent-material-ui.core.fade
  "Imports @material-ui/core/Fade as a Reagent component.
   Original documentation is at https://material-ui.com/api/fade/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def fade (r/adapt-react-class (.-Fade js/MaterialUI)))

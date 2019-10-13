(ns reagent-material-ui.core.zoom
  "Imports @material-ui/core/Zoom as a Reagent component.
   Original documentation is at https://material-ui.com/api/zoom/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def zoom (r/adapt-react-class (.-Zoom js/MaterialUI)))

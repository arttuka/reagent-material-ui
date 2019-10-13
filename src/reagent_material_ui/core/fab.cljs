(ns reagent-material-ui.core.fab
  "Imports @material-ui/core/Fab as a Reagent component.
   Original documentation is at https://material-ui.com/api/fab/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def fab (r/adapt-react-class (.-Fab js/MaterialUI)))

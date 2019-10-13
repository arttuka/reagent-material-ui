(ns reagent-material-ui.core.box
  "Imports @material-ui/core/Box as a Reagent component.
   Original documentation is at https://material-ui.com/api/box/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def box (r/adapt-react-class (.-Box js/MaterialUI)))

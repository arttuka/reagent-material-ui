(ns reagent-material-ui.core.divider
  "Imports @material-ui/core/Divider as a Reagent component.
   Original documentation is at https://material-ui.com/api/divider/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def divider (r/adapt-react-class (.-Divider js/MaterialUI)))

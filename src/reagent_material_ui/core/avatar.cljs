(ns reagent-material-ui.core.avatar
  "Imports @material-ui/core/Avatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/avatar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def avatar (r/adapt-react-class (.-Avatar js/MaterialUI)))

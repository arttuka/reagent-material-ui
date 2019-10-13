(ns reagent-material-ui.core.portal
  "Imports @material-ui/core/Portal as a Reagent component.
   Original documentation is at https://material-ui.com/api/portal/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def portal (r/adapt-react-class (.-Portal js/MaterialUI)))

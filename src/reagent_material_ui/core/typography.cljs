(ns reagent-material-ui.core.typography
  "Imports @material-ui/core/Typography as a Reagent component.
   Original documentation is at https://material-ui.com/api/typography/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def typography (r/adapt-react-class (.-Typography js/MaterialUI)))

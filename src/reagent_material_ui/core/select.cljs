(ns reagent-material-ui.core.select
  "Imports @material-ui/core/Select as a Reagent component.
   Original documentation is at https://material-ui.com/api/select/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def select (r/adapt-react-class (.-Select js/MaterialUI)))

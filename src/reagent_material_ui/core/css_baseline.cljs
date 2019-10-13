(ns reagent-material-ui.core.css-baseline
  "Imports @material-ui/core/CssBaseline as a Reagent component.
   Original documentation is at https://material-ui.com/api/css-baseline/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def css-baseline (r/adapt-react-class (.-CssBaseline js/MaterialUI)))

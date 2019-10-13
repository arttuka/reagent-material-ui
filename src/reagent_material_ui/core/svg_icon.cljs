(ns reagent-material-ui.core.svg-icon
  "Imports @material-ui/core/SvgIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/svg-icon/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def svg-icon (r/adapt-react-class (.-SvgIcon js/MaterialUI)))

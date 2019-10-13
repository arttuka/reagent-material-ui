(ns reagent-material-ui.core.list-subheader
  "Imports @material-ui/core/ListSubheader as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-subheader/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def list-subheader (r/adapt-react-class (.-ListSubheader js/MaterialUI)))

(ns reagent-material-ui.core.menu
  "Imports @material-ui/core/Menu as a Reagent component.
   Original documentation is at https://material-ui.com/api/menu/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def menu (r/adapt-react-class (.-Menu js/MaterialUI)))

(ns reagent-material-ui.core.popper
  "Imports @material-ui/core/Popper as a Reagent component.
   Original documentation is at https://material-ui.com/api/popper/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def popper (r/adapt-react-class (.-Popper js/MaterialUI)))

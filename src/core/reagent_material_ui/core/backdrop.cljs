(ns reagent-material-ui.core.backdrop
  "Imports @material-ui/core/Backdrop as a Reagent component.
   Original documentation is at https://material-ui.com/api/backdrop/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def backdrop (adapt-react-class (.-Backdrop js/MaterialUI) "mui-backdrop"))

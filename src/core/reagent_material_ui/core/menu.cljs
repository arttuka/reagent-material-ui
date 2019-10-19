(ns reagent-material-ui.core.menu
  "Imports @material-ui/core/Menu as a Reagent component.
   Original documentation is at https://material-ui.com/api/menu/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def menu (adapt-react-class (.-Menu js/MaterialUI) "mui-menu"))

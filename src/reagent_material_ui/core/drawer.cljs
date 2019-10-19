(ns reagent-material-ui.core.drawer
  "Imports @material-ui/core/Drawer as a Reagent component.
   Original documentation is at https://material-ui.com/api/drawer/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def drawer (adapt-react-class (.-Drawer js/MaterialUI) "mui-drawer"))

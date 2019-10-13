(ns reagent-material-ui.core.drawer
  "Imports @material-ui/core/Drawer as a Reagent component.
   Original documentation is at https://material-ui.com/api/drawer/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def drawer (r/adapt-react-class (.-Drawer js/MaterialUI)))

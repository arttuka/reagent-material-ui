(ns reagent-material-ui.core.toolbar
  "Imports @material-ui/core/Toolbar as a Reagent component.
   Original documentation is at https://material-ui.com/api/toolbar/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def toolbar (r/adapt-react-class (.-Toolbar js/MaterialUI)))

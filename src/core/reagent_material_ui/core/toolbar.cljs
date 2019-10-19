(ns reagent-material-ui.core.toolbar
  "Imports @material-ui/core/Toolbar as a Reagent component.
   Original documentation is at https://material-ui.com/api/toolbar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def toolbar (adapt-react-class (.-Toolbar js/MaterialUI) "mui-toolbar"))

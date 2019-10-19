(ns reagent-material-ui.core.tabs
  "Imports @material-ui/core/Tabs as a Reagent component.
   Original documentation is at https://material-ui.com/api/tabs/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def tabs (adapt-react-class (.-Tabs js/MaterialUI) "mui-tabs"))

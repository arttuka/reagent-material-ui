(ns reagent-material-ui.core.tabs
  "Imports @material-ui/core/Tabs as a Reagent component.
   Original documentation is at https://material-ui.com/api/tabs/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def tabs (r/adapt-react-class (.-Tabs js/MaterialUI)))

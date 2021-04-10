(ns reagent-material-ui.core.icon
  "Imports @material-ui/core/Icon as a Reagent component.
   Original documentation is at https://material-ui.com/api/icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Icon" :as MuiIcon]))

(def icon (adapt-react-class (.-default MuiIcon) "mui-icon"))

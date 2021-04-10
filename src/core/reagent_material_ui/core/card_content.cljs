(ns reagent-material-ui.core.card-content
  "Imports @material-ui/core/CardContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/CardContent" :as MuiCardContent]))

(def card-content (adapt-react-class (.-default MuiCardContent) "mui-card-content"))

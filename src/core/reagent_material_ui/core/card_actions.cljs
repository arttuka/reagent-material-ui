(ns reagent-material-ui.core.card-actions
  "Imports @material-ui/core/CardActions as a Reagent component.
   Original documentation is at https://material-ui.com/api/card-actions/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/CardActions" :as MuiCardActions]))

(def card-actions (adapt-react-class (.-default MuiCardActions) "mui-card-actions"))

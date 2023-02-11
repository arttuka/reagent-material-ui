(ns reagent-mui.material.card-content
  "Imports @mui/material/CardContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/card-content/ ."
  (:require [reagent.core :as r]
            ["@mui/material/CardContent" :as MuiCardContent]))

(def card-content (r/adapt-react-class (.-default MuiCardContent)))

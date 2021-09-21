(ns reagent-mui.material.card-content
  "Imports @mui/material/CardContent as a Reagent component.
   Original documentation is at https://mui.com/api/card-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CardContent" :as MuiCardContent]))

(def card-content (adapt-react-class (.-default MuiCardContent) "mui-card-content"))

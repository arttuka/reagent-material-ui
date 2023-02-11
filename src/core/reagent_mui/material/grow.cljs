(ns reagent-mui.material.grow
  "Imports @mui/material/Grow as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/grow/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Grow" :as MuiGrow]))

(def grow (r/adapt-react-class (.-default MuiGrow)))

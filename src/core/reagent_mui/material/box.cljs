(ns reagent-mui.material.box
  "Imports @mui/material/Box as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/box/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Box" :as MuiBox]))

(def box (r/adapt-react-class (.-default MuiBox)))

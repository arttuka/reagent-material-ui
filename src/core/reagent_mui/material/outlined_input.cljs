(ns reagent-mui.material.outlined-input
  "Imports @mui/material/OutlinedInput as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/outlined-input/ ."
  (:require [reagent.core :as r]
            ["@mui/material/OutlinedInput" :as MuiOutlinedInput]))

(def outlined-input (r/adapt-react-class (.-default MuiOutlinedInput)))

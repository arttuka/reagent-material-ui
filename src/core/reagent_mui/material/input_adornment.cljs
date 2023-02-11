(ns reagent-mui.material.input-adornment
  "Imports @mui/material/InputAdornment as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input-adornment/ ."
  (:require [reagent.core :as r]
            ["@mui/material/InputAdornment" :as MuiInputAdornment]))

(def input-adornment (r/adapt-react-class (.-default MuiInputAdornment)))

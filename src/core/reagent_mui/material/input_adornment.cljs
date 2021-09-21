(ns reagent-mui.material.input-adornment
  "Imports @mui/material/InputAdornment as a Reagent component.
   Original documentation is at https://mui.com/api/input-adornment/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/InputAdornment" :as MuiInputAdornment]))

(def input-adornment (adapt-react-class (.-default MuiInputAdornment) "mui-input-adornment"))

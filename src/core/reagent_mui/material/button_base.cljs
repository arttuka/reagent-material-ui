(ns reagent-mui.material.button-base
  "Imports @mui/material/ButtonBase as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/button-base/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ButtonBase" :as MuiButtonBase]))

(def button-base (r/adapt-react-class (.-default MuiButtonBase)))

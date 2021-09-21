(ns reagent-mui.material.button-base
  "Imports @mui/material/ButtonBase as a Reagent component.
   Original documentation is at https://mui.com/api/button-base/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ButtonBase" :as MuiButtonBase]))

(def button-base (adapt-react-class (.-default MuiButtonBase) "mui-button-base"))

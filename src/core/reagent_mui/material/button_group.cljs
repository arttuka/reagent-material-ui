(ns reagent-mui.material.button-group
  "Imports @mui/material/ButtonGroup as a Reagent component.
   Original documentation is at https://mui.com/api/button-group/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ButtonGroup" :as MuiButtonGroup]))

(def button-group (adapt-react-class (.-default MuiButtonGroup) "mui-button-group"))

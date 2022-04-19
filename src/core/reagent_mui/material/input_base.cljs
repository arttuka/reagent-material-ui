(ns reagent-mui.material.input-base
  "Imports @mui/material/InputBase as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input-base/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/InputBase" :as MuiInputBase]))

(def input-base (adapt-react-class (.-default MuiInputBase) "mui-input-base"))

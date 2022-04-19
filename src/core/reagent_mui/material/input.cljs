(ns reagent-mui.material.input
  "Imports @mui/material/Input as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/input/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Input" :as MuiInput]))

(def input (adapt-react-class (.-default MuiInput) "mui-input"))

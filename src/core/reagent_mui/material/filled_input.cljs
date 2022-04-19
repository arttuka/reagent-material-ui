(ns reagent-mui.material.filled-input
  "Imports @mui/material/FilledInput as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/filled-input/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FilledInput" :as MuiFilledInput]))

(def filled-input (adapt-react-class (.-default MuiFilledInput) "mui-filled-input"))

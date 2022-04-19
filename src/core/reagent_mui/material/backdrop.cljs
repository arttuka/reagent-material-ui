(ns reagent-mui.material.backdrop
  "Imports @mui/material/Backdrop as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/backdrop/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Backdrop" :as MuiBackdrop]))

(def backdrop (adapt-react-class (.-default MuiBackdrop) "mui-backdrop"))

(ns reagent-mui.material.backdrop
  "Imports @mui/material/Backdrop as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/backdrop/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Backdrop" :as MuiBackdrop]))

(def backdrop (r/adapt-react-class (.-default MuiBackdrop)))

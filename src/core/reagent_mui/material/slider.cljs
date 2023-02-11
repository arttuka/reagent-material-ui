(ns reagent-mui.material.slider
  "Imports @mui/material/Slider as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/slider/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Slider" :as MuiSlider]))

(def slider (r/adapt-react-class (.-default MuiSlider)))

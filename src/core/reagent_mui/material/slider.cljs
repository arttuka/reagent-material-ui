(ns reagent-mui.material.slider
  "Imports @mui/material/Slider as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/slider/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Slider" :as MuiSlider]))

(def slider (adapt-react-class (.-default MuiSlider) "mui-slider"))

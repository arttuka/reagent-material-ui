(ns reagent-mui.material.slide
  "Imports @mui/material/Slide as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/slide/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Slide" :as MuiSlide]))

(def slide (r/adapt-react-class (.-default MuiSlide)))

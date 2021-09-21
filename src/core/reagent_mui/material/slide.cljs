(ns reagent-mui.material.slide
  "Imports @mui/material/Slide as a Reagent component.
   Original documentation is at https://mui.com/api/slide/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Slide" :as MuiSlide]))

(def slide (adapt-react-class (.-default MuiSlide) "mui-slide"))

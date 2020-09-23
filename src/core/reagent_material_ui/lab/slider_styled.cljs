(ns reagent-material-ui.lab.slider-styled
  "Imports @material-ui/lab/SliderStyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/slider-styled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SliderStyled" :as MuiSliderStyled]))

(def slider-styled (adapt-react-class (or (.-default MuiSliderStyled) (.-SliderStyled MuiSliderStyled)) "mui-slider-styled"))

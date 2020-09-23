(ns reagent-material-ui.lab.slider-unstyled
  "Imports @material-ui/lab/SliderUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/slider-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SliderUnstyled" :as MuiSliderUnstyled]))

(def slider-unstyled (adapt-react-class (or (.-default MuiSliderUnstyled) (.-SliderUnstyled MuiSliderUnstyled)) "mui-slider-unstyled"))

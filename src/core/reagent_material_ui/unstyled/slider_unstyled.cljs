(ns reagent-material-ui.unstyled.slider-unstyled
  "Imports @material-ui/unstyled/SliderUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/slider-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/SliderUnstyled" :as MuiSliderUnstyled]))

(def slider-unstyled (adapt-react-class (.-default MuiSliderUnstyled) "mui-slider-unstyled"))

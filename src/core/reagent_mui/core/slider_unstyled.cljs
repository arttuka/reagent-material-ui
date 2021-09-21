(ns reagent-mui.core.slider-unstyled
  "Imports @mui/core/SliderUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/slider-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/SliderUnstyled" :as MuiSliderUnstyled]))

(def slider-unstyled (adapt-react-class (.-default MuiSliderUnstyled) "mui-slider-unstyled"))

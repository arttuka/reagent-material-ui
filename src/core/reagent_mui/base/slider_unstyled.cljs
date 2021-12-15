(ns reagent-mui.base.slider-unstyled
  "Imports @mui/base/SliderUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/slider-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/SliderUnstyled" :as MuiSliderUnstyled]))

(def slider-unstyled (adapt-react-class (.-default MuiSliderUnstyled) "mui-slider-unstyled"))

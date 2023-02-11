(ns reagent-mui.base.slider-unstyled
  "Imports @mui/base/SliderUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/slider-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/SliderUnstyled" :as MuiSliderUnstyled]))

(def slider-unstyled (r/adapt-react-class (.-default MuiSliderUnstyled)))

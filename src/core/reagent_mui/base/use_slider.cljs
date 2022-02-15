(ns reagent-mui.base.use-slider
  "Imports @mui/base/SliderUnstyled/useSlider as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-slider/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/SliderUnstyled" :as MuiSliderUnstyled]))

(def use-slider (wrap-js-function (.-useSlider MuiSliderUnstyled)))

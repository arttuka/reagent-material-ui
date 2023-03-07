(ns reagent-mui.base.use-slider
  "Imports @mui/base/useSlider as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-slider/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useSlider" :as MuiuseSlider]))

(def use-slider (wrap-js-function (.-default MuiuseSlider)))

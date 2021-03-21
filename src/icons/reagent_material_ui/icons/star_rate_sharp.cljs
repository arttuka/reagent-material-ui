(ns reagent-material-ui.icons.star-rate-sharp
  "Imports @material-ui/icons/StarRateSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def star-rate-sharp (create-svg-icon (e "path" #js {"d" "M14.43 10L12 2l-2.43 8H2l6.18 4.41L5.83 22 12 17.31 18.18 22l-2.35-7.59L22 10z"})
                                      "StarRateSharp"))

(ns reagent-mui.icons.noise-control-off-rounded
  "Imports @mui/icons-material/NoiseControlOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def noise-control-off-rounded (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "5"})
                                                "NoiseControlOffRounded"))

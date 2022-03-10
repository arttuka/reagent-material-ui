(ns reagent-mui.icons.noise-control-off-outlined
  "Imports @mui/icons-material/NoiseControlOffOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def noise-control-off-outlined (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "5"})
                                                 "NoiseControlOffOutlined"))

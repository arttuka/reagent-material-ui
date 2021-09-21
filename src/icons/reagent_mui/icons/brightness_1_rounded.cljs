(ns reagent-mui.icons.brightness-1-rounded
  "Imports @mui/icons-material/Brightness1Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def brightness-1-rounded (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "10"})
                                           "Brightness1Rounded"))

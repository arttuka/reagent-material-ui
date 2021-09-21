(ns reagent-mui.icons.brightness-1-sharp
  "Imports @mui/icons-material/Brightness1Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def brightness-1-sharp (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "10"})
                                         "Brightness1Sharp"))

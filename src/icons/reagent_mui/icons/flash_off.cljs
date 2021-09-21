(ns reagent-mui.icons.flash-off
  "Imports @mui/icons-material/FlashOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flash-off (create-svg-icon (e "path" #js {"d" "M3.27 3 2 4.27l5 5V13h3v9l3.58-6.14L17.73 20 19 18.73 3.27 3zM17 10h-4l4-8H7v2.18l8.46 8.46L17 10z"})
                                "FlashOff"))

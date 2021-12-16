(ns reagent-mui.icons.hls-off-sharp
  "Imports @mui/icons-material/HlsOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hls-off-sharp (create-svg-icon (e "path" #js {"d" "M17.83 15h2.67v-3.5H17v-1h2v.5h1.5V9h-5v3.5H19v1h-2V13h-1.17l2 2zM8 10.83V15H6.5v-2.5h-2V15H3V9h1.5v2h2V9.33L1.39 4.22 2.8 2.81l18.38 18.38-1.41 1.41-7.6-7.6H10v-2.17l-2-2z"})
                                    "HlsOffSharp"))

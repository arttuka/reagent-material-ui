(ns reagent-mui.icons.twenty-three-mp-sharp
  "Imports @mui/icons-material/TwentyThreeMpSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def twenty-three-mp-sharp (create-svg-icon [(e "path" #js {"d" "M3 3v18h18V3H3zm3.5 5h3V7h-3V5.5H11V9H8v1h3v1.5H6.5V8zm6 10.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM13 10h3V9h-2V8h2V7h-3V5.5h4.5v6H13V10zm5 7h-3v1.5h-1.5v-6H18V17z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"})]
                                            "TwentyThreeMpSharp"))

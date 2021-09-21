(ns reagent-mui.icons.missed-video-call-sharp
  "Imports @mui/icons-material/MissedVideoCallSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def missed-video-call-sharp (create-svg-icon (e "path" #js {"d" "M17 10.5V6H3v12h14v-4.5l4 4v-11l-4 4zM10 15l-3.89-3.89v2.55H5V9.22h4.44v1.11H6.89l3.11 3.1 4.22-4.22.78.79-5 5z"})
                                              "MissedVideoCallSharp"))

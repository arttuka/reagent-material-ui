(ns reagent-mui.icons.art-track-sharp
  "Imports @mui/icons-material/ArtTrackSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def art-track-sharp (create-svg-icon (e "path" #js {"d" "M22 13h-8v-2h8v2zm0-6h-8v2h8V7zm-8 10h8v-2h-8v2zM12 7v10H2V7h10zm-1.5 8-2.25-3-1.75 2.26-1.25-1.51L3.5 15h7z"})
                                      "ArtTrackSharp"))

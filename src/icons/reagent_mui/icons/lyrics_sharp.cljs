(ns reagent-mui.icons.lyrics-sharp
  "Imports @mui/icons-material/LyricsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lyrics-sharp (create-svg-icon [(e "path" #js {"d" "M14 9c0-2.04 1.24-3.79 3-4.57V4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9c1.1 0 2-.9 2-2v-2.42c-1.76-.78-3-2.53-3-4.58zm-4 5H6v-2h4v2zm3-3H6V9h7v2zm0-3H6V6h7v2z"}) (e "path" #js {"d" "M20 6.18c-.31-.11-.65-.18-1-.18-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3V3h2V1h-4v5.18z"})]
                                   "LyricsSharp"))

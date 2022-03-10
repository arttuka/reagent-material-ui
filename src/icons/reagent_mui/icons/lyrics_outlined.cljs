(ns reagent-mui.icons.lyrics-outlined
  "Imports @mui/icons-material/LyricsOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def lyrics-outlined (create-svg-icon [(e "path" #js {"d" "M6 6h7v2H6zm0 6h4v2H6z"}) (e "path" #js {"d" "M15 11.97V16H6l-2 2V4h11v2.03c.52-.69 1.2-1.25 2-1.6V4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9c1.1 0 2-.9 2-2v-2.42c-.8-.36-1.48-.92-2-1.61z"}) (e "path" #js {"d" "M6 9h7v2H6zm14-2.82c-.31-.11-.65-.18-1-.18-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3V3h2V1h-4v5.18z"})]
                                      "LyricsOutlined"))

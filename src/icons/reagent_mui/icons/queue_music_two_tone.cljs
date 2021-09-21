(ns reagent-mui.icons.queue-music-two-tone
  "Imports @mui/icons-material/QueueMusicTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def queue-music-two-tone (create-svg-icon [(e "circle" #js {"cx" "16", "cy" "17", "r" "1", "opacity" ".3"}) (e "path" #js {"d" "M3 10h12v2H3v-2zm0 4h8v2H3v-2zm0-8h12v2H3V6zm14 8.18c-.31-.11-.65-.18-1-.18-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3V8h3V6h-5v8.18z"})]
                                           "QueueMusicTwoTone"))

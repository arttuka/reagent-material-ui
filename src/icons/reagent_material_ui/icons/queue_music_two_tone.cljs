(ns reagent-material-ui.icons.queue-music-two-tone
  "Imports @material-ui/icons/QueueMusicTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def queue-music-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "1", "cx" "16", "opacity" ".3"}) (e "path" #js {"d" "M3 10h12v2H3v-2zm0 4h8v2H3v-2zm0-8h12v2H3V6zm14 8.18c-.31-.11-.65-.18-1-.18-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3V8h3V6h-5v8.18z"}))
                                           "QueueMusicTwoTone"))

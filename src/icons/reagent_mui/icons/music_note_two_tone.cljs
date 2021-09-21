(ns reagent-mui.icons.music-note-two-tone
  "Imports @mui/icons-material/MusicNoteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def music-note-two-tone (create-svg-icon [(e "circle" #js {"cx" "10.01", "cy" "17", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "m12 3 .01 10.55c-.59-.34-1.27-.55-2-.55C7.79 13 6 14.79 6 17s1.79 4 4.01 4S14 19.21 14 17V7h4V3h-6zm-1.99 16c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})]
                                          "MusicNoteTwoTone"))

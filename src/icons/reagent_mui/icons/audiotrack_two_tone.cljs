(ns reagent-mui.icons.audiotrack-two-tone
  "Imports @mui/icons-material/AudiotrackTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def audiotrack-two-tone (create-svg-icon [(e "circle" #js {"cx" "10", "cy" "17", "r" "2", "opacity" ".3"}) (e "path" #js {"d" "M10 21c2.21 0 4-1.79 4-4V7h4V3h-6v10.55c-.59-.34-1.27-.55-2-.55-2.21 0-4 1.79-4 4s1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2z"})]
                                          "AudiotrackTwoTone"))

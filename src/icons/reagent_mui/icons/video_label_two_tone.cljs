(ns reagent-mui.icons.video-label-two-tone
  "Imports @mui/icons-material/VideoLabelTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-label-two-tone (create-svg-icon [(e "path" #js {"d" "M3 5h18v11H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 13H3V5h18v11z"})]
                                           "VideoLabelTwoTone"))

(ns reagent-mui.icons.spatial-audio-rounded
  "Imports @mui/icons-material/SpatialAudioRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def spatial-audio-rounded (create-svg-icon [(e "path" #js {"d" "M22.11 7.95c-1.89-.23-5.57-1.83-6.09-6.09-.06-.5-.48-.86-.98-.86-.6 0-1.07.53-1 1.13.31 2.43 2.38 7.12 7.8 7.8.6.08 1.13-.4 1.13-1 0-.5-.37-.92-.86-.98zm-.4-2.12c.64.17 1.26-.31 1.26-.97 0-.47-.34-.85-.79-.97-.49-.14-1.72-.68-2.11-2.13-.12-.44-.5-.76-.96-.76h-.01c-.66 0-1.14.64-.96 1.28.6 2.22 2.44 3.25 3.57 3.55z"}) (e "circle" #js {"cx" "10", "cy" "9", "r" "4"}) (e "path" #js {"d" "M16.39 15.56C14.71 14.7 12.53 14 10 14s-4.71.7-6.39 1.56C2.61 16.07 2 17.1 2 18.22V21h16v-2.78c0-1.12-.61-2.15-1.61-2.66z"})]
                                            "SpatialAudioRounded"))

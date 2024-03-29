(ns reagent-mui.icons.spatial-audio-off-rounded
  "Imports @mui/icons-material/SpatialAudioOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def spatial-audio-off-rounded (create-svg-icon [(e "circle" #js {"cx" "10", "cy" "9", "r" "4"}) (e "path" #js {"d" "M16.39 15.56C14.71 14.7 12.53 14 10 14s-4.71.7-6.39 1.56C2.61 16.07 2 17.1 2 18.22V19c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-.78c0-1.12-.61-2.15-1.61-2.66zm4.72-13.71c-.37-.48-1.08-.52-1.5-.09-.35.35-.39.91-.09 1.3 1.17 1.5 2.64 5.23 0 8.61-.3.39-.26.95.09 1.3.43.43 1.13.38 1.5-.09 1.5-1.93 3.35-6.72 0-11.03zm-2.8 2.99c-.33-.57-1.11-.67-1.58-.21-.33.33-.36.84-.13 1.25.25.44.74 1.69-.01 2.99-.23.4-.19.9.14 1.22.47.47 1.25.35 1.58-.22 1.16-1.99.58-4.02 0-5.03z"})]
                                                "SpatialAudioOffRounded"))

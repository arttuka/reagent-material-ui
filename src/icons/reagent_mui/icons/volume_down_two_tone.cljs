(ns reagent-mui.icons.volume-down-two-tone
  "Imports @mui/icons-material/VolumeDownTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volume-down-two-tone (create-svg-icon [(e "path" #js {"d" "M7 13h2.83L12 15.17V8.83L9.83 11H7z", "opacity" ".3"}) (e "path" #js {"d" "M16 7.97v8.05c1.48-.73 2.5-2.25 2.5-4.02 0-1.77-1.02-3.29-2.5-4.03zM5 9v6h4l5 5V4L9 9H5zm7-.17v6.34L9.83 13H7v-2h2.83L12 8.83z"})]
                                           "VolumeDownTwoTone"))

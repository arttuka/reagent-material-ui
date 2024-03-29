(ns reagent-mui.icons.volume-up-two-tone
  "Imports @mui/icons-material/VolumeUpTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volume-up-two-tone (create-svg-icon [(e "path" #js {"d" "M5 13h2.83L10 15.17V8.83L7.83 11H5z", "opacity" ".3"}) (e "path" #js {"d" "M3 9v6h4l5 5V4L7 9H3zm7-.17v6.34L7.83 13H5v-2h2.83L10 8.83zm4-.86v8.05c1.48-.73 2.5-2.25 2.5-4.02 0-1.77-1.02-3.29-2.5-4.03zm0-4.74v2.06c2.89.86 5 3.54 5 6.71s-2.11 5.85-5 6.71v2.06c4.01-.91 7-4.49 7-8.77 0-4.28-2.99-7.86-7-8.77z"})]
                                         "VolumeUpTwoTone"))

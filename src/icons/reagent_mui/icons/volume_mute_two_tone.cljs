(ns reagent-mui.icons.volume-mute-two-tone
  "Imports @mui/icons-material/VolumeMuteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volume-mute-two-tone (create-svg-icon [(e "path" #js {"d" "M9 13h2.83L14 15.17V8.83L11.83 11H9z", "opacity" ".3"}) (e "path" #js {"d" "M7 9v6h4l5 5V4l-5 5H7zm7-.17v6.34L11.83 13H9v-2h2.83L14 8.83z"})]
                                           "VolumeMuteTwoTone"))

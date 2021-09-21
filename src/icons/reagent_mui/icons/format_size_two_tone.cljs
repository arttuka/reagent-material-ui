(ns reagent-mui.icons.format-size-two-tone
  "Imports @mui/icons-material/FormatSizeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-size-two-tone (create-svg-icon (e "path" #js {"d" "M3 12h3v7h3v-7h3V9H3zm6-5h5v12h3V7h5V4H9z"})
                                           "FormatSizeTwoTone"))

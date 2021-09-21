(ns reagent-mui.icons.pause-two-tone
  "Imports @mui/icons-material/PauseTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pause-two-tone (create-svg-icon (e "path" #js {"d" "M6 5h4v14H6zm8 0h4v14h-4z"})
                                     "PauseTwoTone"))

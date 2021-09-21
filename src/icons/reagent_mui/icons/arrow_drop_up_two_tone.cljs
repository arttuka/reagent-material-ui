(ns reagent-mui.icons.arrow-drop-up-two-tone
  "Imports @mui/icons-material/ArrowDropUpTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-drop-up-two-tone (create-svg-icon (e "path" #js {"d" "m7 14 5-5 5 5H7z"})
                                             "ArrowDropUpTwoTone"))

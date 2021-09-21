(ns reagent-mui.icons.arrow-left-two-tone
  "Imports @mui/icons-material/ArrowLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-left-two-tone (create-svg-icon (e "path" #js {"d" "m14 7-5 5 5 5V7z"})
                                          "ArrowLeftTwoTone"))

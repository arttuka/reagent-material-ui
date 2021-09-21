(ns reagent-mui.icons.flash-on-two-tone
  "Imports @mui/icons-material/FlashOnTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flash-on-two-tone (create-svg-icon (e "path" #js {"d" "M17 10h-4l3-8H7v11h3v9z"})
                                        "FlashOnTwoTone"))

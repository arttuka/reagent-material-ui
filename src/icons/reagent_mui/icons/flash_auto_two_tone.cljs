(ns reagent-mui.icons.flash-auto-two-tone
  "Imports @mui/icons-material/FlashAutoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flash-auto-two-tone (create-svg-icon (e "path" #js {"d" "M3 2v12h3v9l7-12H9l4-9zm14 0-3.2 9h1.9l.7-2h3.2l.7 2h1.9L19 2h-2zm-.15 5.65L18 4l1.15 3.65h-2.3z"})
                                          "FlashAutoTwoTone"))

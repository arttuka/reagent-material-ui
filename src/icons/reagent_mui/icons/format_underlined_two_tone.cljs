(ns reagent-mui.icons.format-underlined-two-tone
  "Imports @mui/icons-material/FormatUnderlinedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-underlined-two-tone (create-svg-icon (e "path" #js {"d" "M5 19h14v2H5zM6 3v8c0 3.31 2.69 6 6 6s6-2.69 6-6V3h-2.5v8c0 1.93-1.57 3.5-3.5 3.5S8.5 12.93 8.5 11V3H6z"})
                                                 "FormatUnderlinedTwoTone"))

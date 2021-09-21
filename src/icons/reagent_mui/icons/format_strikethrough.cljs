(ns reagent-mui.icons.format-strikethrough
  "Imports @mui/icons-material/FormatStrikethrough as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-strikethrough (create-svg-icon (e "path" #js {"d" "M10 19h4v-3h-4v3zM5 4v3h5v3h4V7h5V4H5zM3 14h18v-2H3v2z"})
                                           "FormatStrikethrough"))

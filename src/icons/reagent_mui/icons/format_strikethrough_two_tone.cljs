(ns reagent-mui.icons.format-strikethrough-two-tone
  "Imports @mui/icons-material/FormatStrikethroughTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-strikethrough-two-tone (create-svg-icon (e "path" #js {"d" "M3 12h18v2H3zm11-2V7h5V4H5v3h5v3zm-4 6h4v3h-4z"})
                                                    "FormatStrikethroughTwoTone"))

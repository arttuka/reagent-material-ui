(ns reagent-mui.icons.format-list-numbered-two-tone
  "Imports @mui/icons-material/FormatListNumberedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-list-numbered-two-tone (create-svg-icon (e "path" #js {"d" "M5 13H3.2L5 10.9V10H2v1h1.8L2 13.1v.9h3zm2-8h14v2H7zM5 16H2v1h2v.5H3v1h1v.5H2v1h3zm2 1h14v2H7zM3 8h1V4H2v1h1zm4 3h14v2H7z"})
                                                    "FormatListNumberedTwoTone"))

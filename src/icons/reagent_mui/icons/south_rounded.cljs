(ns reagent-mui.icons.south-rounded
  "Imports @mui/icons-material/SouthRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-rounded (create-svg-icon (e "path" #js {"d" "M18.3 14.29a.9959.9959 0 0 0-1.41 0L13 18.17V3c0-.55-.45-1-1-1s-1 .45-1 1v15.18L7.12 14.3a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l5.59 5.59c.39.39 1.02.39 1.41 0l5.59-5.59c.38-.39.38-1.03 0-1.42z"})
                                    "SouthRounded"))

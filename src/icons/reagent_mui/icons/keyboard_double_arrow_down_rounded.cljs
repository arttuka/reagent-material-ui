(ns reagent-mui.icons.keyboard-double-arrow-down-rounded
  "Imports @mui/icons-material/KeyboardDoubleArrowDownRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-down-rounded (create-svg-icon [(e "path" #js {"d" "M17.29 5.71a.9959.9959 0 0 0-1.41 0L12 9.58 8.11 5.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0l4.59-4.59c.39-.38.39-1.01 0-1.4z"}) (e "path" #js {"d" "M17.29 12.3a.9959.9959 0 0 0-1.41 0L12 16.17l-3.88-3.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0l4.59-4.59c.38-.38.38-1.01-.01-1.4z"})]
                                                         "KeyboardDoubleArrowDownRounded"))

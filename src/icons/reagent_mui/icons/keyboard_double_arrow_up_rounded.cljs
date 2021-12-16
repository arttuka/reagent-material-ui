(ns reagent-mui.icons.keyboard-double-arrow-up-rounded
  "Imports @mui/icons-material/KeyboardDoubleArrowUpRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-up-rounded (create-svg-icon [(e "path" #js {"d" "M6.7 18.29c.39.39 1.02.39 1.41 0L12 14.42l3.88 3.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 12.3a.9959.9959 0 0 0-1.41 0L6.7 16.88c-.39.39-.39 1.02 0 1.41z"}) (e "path" #js {"d" "M6.7 11.7c.39.39 1.02.39 1.41 0L12 7.83l3.88 3.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 5.71a.9959.9959 0 0 0-1.41 0L6.7 10.29c-.39.39-.39 1.02 0 1.41z"})]
                                                       "KeyboardDoubleArrowUpRounded"))

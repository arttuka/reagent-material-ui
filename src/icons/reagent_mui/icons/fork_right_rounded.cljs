(ns reagent-mui.icons.fork-right-rounded
  "Imports @mui/icons-material/ForkRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fork-right-rounded (create-svg-icon (e "path" #js {"d" "M9 20c0 .55.45 1 1 1s1-.45 1-1v-3c.73-2.58 3.07-3.47 5.17-3l-.88.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l2.59-2.59c.39-.39.39-1.02 0-1.41L16.7 9.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.88.89c-1.51-.33-3.73.08-5.17 1.36V6.83l.88.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L10.7 3.71a.9959.9959 0 0 0-1.41 0L6.71 6.29c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L9 6.83V20z"})
                                         "ForkRightRounded"))

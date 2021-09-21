(ns reagent-mui.icons.chevron-right-two-tone
  "Imports @mui/icons-material/ChevronRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chevron-right-two-tone (create-svg-icon (e "path" #js {"d" "M10 6 8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6-6-6z"})
                                             "ChevronRightTwoTone"))

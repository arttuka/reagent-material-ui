(ns reagent-mui.icons.chevron-left-two-tone
  "Imports @mui/icons-material/ChevronLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chevron-left-two-tone (create-svg-icon (e "path" #js {"d" "M15.41 7.41 14 6l-6 6 6 6 1.41-1.41L10.83 12l4.58-4.59z"})
                                            "ChevronLeftTwoTone"))

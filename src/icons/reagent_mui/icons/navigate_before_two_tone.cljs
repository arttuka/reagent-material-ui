(ns reagent-mui.icons.navigate-before-two-tone
  "Imports @mui/icons-material/NavigateBeforeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigate-before-two-tone (create-svg-icon (e "path" #js {"d" "m14.2 6-6 6 6 6 1.41-1.41L11.03 12l4.58-4.59z"})
                                               "NavigateBeforeTwoTone"))

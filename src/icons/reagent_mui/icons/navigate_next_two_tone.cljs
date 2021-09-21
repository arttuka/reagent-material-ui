(ns reagent-mui.icons.navigate-next-two-tone
  "Imports @mui/icons-material/NavigateNextTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigate-next-two-tone (create-svg-icon (e "path" #js {"d" "m10.02 18 6-6-6-6-1.41 1.41L13.19 12l-4.58 4.59z"})
                                             "NavigateNextTwoTone"))

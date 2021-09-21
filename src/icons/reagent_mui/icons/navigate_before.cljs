(ns reagent-mui.icons.navigate-before
  "Imports @mui/icons-material/NavigateBefore as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigate-before (create-svg-icon (e "path" #js {"d" "M15.41 7.41 14 6l-6 6 6 6 1.41-1.41L10.83 12z"})
                                      "NavigateBefore"))

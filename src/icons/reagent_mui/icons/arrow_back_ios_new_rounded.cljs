(ns reagent-mui.icons.arrow-back-ios-new-rounded
  "Imports @mui/icons-material/ArrowBackIosNewRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-back-ios-new-rounded (create-svg-icon (e "path" #js {"d" "M16.88 2.88c-.49-.49-1.28-.49-1.77 0L6.7 11.29c-.39.39-.39 1.02 0 1.41l8.41 8.41c.49.49 1.28.49 1.77 0s.49-1.28 0-1.77L9.54 12l7.35-7.35c.48-.49.48-1.28-.01-1.77z"})
                                                 "ArrowBackIosNewRounded"))

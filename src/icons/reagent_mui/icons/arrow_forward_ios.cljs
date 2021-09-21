(ns reagent-mui.icons.arrow-forward-ios
  "Imports @mui/icons-material/ArrowForwardIos as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-forward-ios (create-svg-icon (e "path" #js {"d" "M6.23 20.23 8 22l10-10L8 2 6.23 3.77 14.46 12z"})
                                        "ArrowForwardIos"))

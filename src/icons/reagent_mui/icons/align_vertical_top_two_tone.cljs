(ns reagent-mui.icons.align-vertical-top-two-tone
  "Imports @mui/icons-material/AlignVerticalTopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-vertical-top-two-tone (create-svg-icon (e "path" #js {"d" "M22 2v2H2V2h20zM7 22h3V6H7v16zm7-6h3V6h-3v10z"})
                                                  "AlignVerticalTopTwoTone"))

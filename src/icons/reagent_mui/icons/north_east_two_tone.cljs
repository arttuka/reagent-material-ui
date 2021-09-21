(ns reagent-mui.icons.north-east-two-tone
  "Imports @mui/icons-material/NorthEastTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def north-east-two-tone (create-svg-icon (e "path" #js {"d" "M9 5v2h6.59L4 18.59 5.41 20 17 8.41V15h2V5H9z"})
                                          "NorthEastTwoTone"))

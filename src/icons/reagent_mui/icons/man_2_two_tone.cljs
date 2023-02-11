(ns reagent-mui.icons.man-2-two-tone
  "Imports @mui/icons-material/Man2TwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-2-two-tone (create-svg-icon [(e "path" #js {"d" "M14 7h-4c-1.1 0-2 .9-2 2v6h2.5v7h3v-7H16V9c0-1.1-.9-2-2-2z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                     "Man2TwoTone"))

(ns reagent-mui.icons.man-2-sharp
  "Imports @mui/icons-material/Man2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-2-sharp (create-svg-icon [(e "path" #js {"d" "M16 7H8v8h2.5v7h3v-7H16z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                  "Man2Sharp"))

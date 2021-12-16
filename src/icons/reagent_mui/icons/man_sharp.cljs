(ns reagent-mui.icons.man-sharp
  "Imports @mui/icons-material/ManSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-sharp (create-svg-icon [(e "path" #js {"d" "M16 7H8v8h2v7h4v-7h2z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                "ManSharp"))

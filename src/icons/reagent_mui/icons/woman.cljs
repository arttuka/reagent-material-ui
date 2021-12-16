(ns reagent-mui.icons.woman
  "Imports @mui/icons-material/Woman as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def woman (create-svg-icon [(e "path" #js {"d" "M13.94 8.31C13.62 7.52 12.85 7 12 7s-1.62.52-1.94 1.31L7 16h3v6h4v-6h3l-3.06-7.69z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                            "Woman"))

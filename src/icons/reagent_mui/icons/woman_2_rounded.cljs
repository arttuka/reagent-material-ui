(ns reagent-mui.icons.woman-2-rounded
  "Imports @mui/icons-material/Woman2Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def woman-2-rounded (create-svg-icon [(e "path" #js {"d" "M13.94 8.31c-.38-.96-1.42-1.52-2.48-1.24-.66.17-1.18.7-1.43 1.34l-2.48 6.22c-.27.66.22 1.37.92 1.37h2.03v5c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-5h2.03c.71 0 1.19-.71.93-1.37l-2.52-6.32z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                      "Woman2Rounded"))

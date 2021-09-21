(ns reagent-mui.icons.category-sharp
  "Imports @mui/icons-material/CategorySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def category-sharp (create-svg-icon [(e "path" #js {"d" "m12 2-5.5 9h11z"}) (e "circle" #js {"cx" "17.5", "cy" "17.5", "r" "4.5"}) (e "path" #js {"d" "M3 13.5h8v8H3z"})]
                                     "CategorySharp"))

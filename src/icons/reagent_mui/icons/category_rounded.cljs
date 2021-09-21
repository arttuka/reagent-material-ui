(ns reagent-mui.icons.category-rounded
  "Imports @mui/icons-material/CategoryRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def category-rounded (create-svg-icon [(e "path" #js {"d" "M11.15 3.4 7.43 9.48c-.41.66.07 1.52.85 1.52h7.43c.78 0 1.26-.86.85-1.52L12.85 3.4c-.39-.64-1.31-.64-1.7 0z"}) (e "circle" #js {"cx" "17.5", "cy" "17.5", "r" "4.5"}) (e "path" #js {"d" "M4 21.5h6c.55 0 1-.45 1-1v-6c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1z"})]
                                       "CategoryRounded"))

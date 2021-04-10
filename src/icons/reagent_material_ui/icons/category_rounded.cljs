(ns reagent-material-ui.icons.category-rounded
  "Imports @material-ui/icons/CategoryRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def category-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.15 3.4L7.43 9.48c-.41.66.07 1.52.85 1.52h7.43c.78 0 1.26-.86.85-1.52L12.85 3.4c-.39-.64-1.31-.64-1.7 0z"}) (e "circle" #js {"cy" "17.5", "r" "4.5", "cx" "17.5"}) (e "path" #js {"d" "M4 21.5h6c.55 0 1-.45 1-1v-6c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1z"}))
                                       "CategoryRounded"))

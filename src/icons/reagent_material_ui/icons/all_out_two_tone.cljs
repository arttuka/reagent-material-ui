(ns reagent-material-ui.icons.all-out-two-tone
  "Imports @material-ui/icons/AllOutTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def all-out-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "5", "cx" "12", "opacity" ".3"}) (e "path" #js {"d" "M4 4v4l4-4zm12 0l4 4V4zm4 16v-4l-4 4zM4 20h4l-4-4zm15-8c0-3.87-3.13-7-7-7s-7 3.13-7 7 3.13 7 7 7 7-3.13 7-7zm-7 5c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}))
                                       "AllOutTwoTone"))

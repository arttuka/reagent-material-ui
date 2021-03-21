(ns reagent-material-ui.icons.keyboard-arrow-right-two-tone
  "Imports @material-ui/icons/KeyboardArrowRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-arrow-right-two-tone (create-svg-icon (e "path" #js {"d" "M8.59 16.59L13.17 12 8.59 7.41 10 6l6 6-6 6-1.41-1.41z"})
                                                    "KeyboardArrowRightTwoTone"))

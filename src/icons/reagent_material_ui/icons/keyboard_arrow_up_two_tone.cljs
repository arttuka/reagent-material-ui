(ns reagent-material-ui.icons.keyboard-arrow-up-two-tone
  "Imports @material-ui/icons/KeyboardArrowUpTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-arrow-up-two-tone (create-svg-icon (e "path" #js {"d" "M7.41 15.41 12 10.83l4.59 4.58L18 14l-6-6-6 6 1.41 1.41z"})
                                                 "KeyboardArrowUpTwoTone"))

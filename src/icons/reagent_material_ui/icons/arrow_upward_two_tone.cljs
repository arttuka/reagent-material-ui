(ns reagent-material-ui.icons.arrow-upward-two-tone
  "Imports @material-ui/icons/ArrowUpwardTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-upward-two-tone (create-svg-icon (e "path" #js {"d" "M4 12l1.41 1.41L11 7.83V20h2V7.83l5.58 5.59L20 12l-8-8-8 8z"})
                                            "ArrowUpwardTwoTone"))

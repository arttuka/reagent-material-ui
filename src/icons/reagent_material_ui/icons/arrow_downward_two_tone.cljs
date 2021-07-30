(ns reagent-material-ui.icons.arrow-downward-two-tone
  "Imports @material-ui/icons/ArrowDownwardTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-downward-two-tone (create-svg-icon (e "path" #js {"d" "m20 12-1.41-1.41L13 16.17V4h-2v12.17l-5.58-5.59L4 12l8 8 8-8z"})
                                              "ArrowDownwardTwoTone"))

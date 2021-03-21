(ns reagent-material-ui.icons.vertical-align-center-two-tone
  "Imports @material-ui/icons/VerticalAlignCenterTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vertical-align-center-two-tone (create-svg-icon (e "path" #js {"d" "M11 1v4H8l4 4 4-4h-3V1zM4 11h16v2H4zm4 8h3v4h2v-4h3l-4-4z"})
                                                     "VerticalAlignCenterTwoTone"))

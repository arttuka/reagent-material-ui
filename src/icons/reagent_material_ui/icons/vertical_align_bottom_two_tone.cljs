(ns reagent-material-ui.icons.vertical-align-bottom-two-tone
  "Imports @material-ui/icons/VerticalAlignBottomTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vertical-align-bottom-two-tone (create-svg-icon (e "path" #js {"d" "M11 3v10H8l4 4 4-4h-3V3zM4 19h16v2H4z"})
                                                     "VerticalAlignBottomTwoTone"))

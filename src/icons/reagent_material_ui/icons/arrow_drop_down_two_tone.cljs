(ns reagent-material-ui.icons.arrow-drop-down-two-tone
  "Imports @material-ui/icons/ArrowDropDownTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-drop-down-two-tone (create-svg-icon (e "path" #js {"d" "M7 10l5 5 5-5H7z"})
                                               "ArrowDropDownTwoTone"))

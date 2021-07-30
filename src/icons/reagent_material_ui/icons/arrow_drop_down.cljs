(ns reagent-material-ui.icons.arrow-drop-down
  "Imports @material-ui/icons/ArrowDropDown as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-drop-down (create-svg-icon (e "path" #js {"d" "m7 10 5 5 5-5z"})
                                      "ArrowDropDown"))

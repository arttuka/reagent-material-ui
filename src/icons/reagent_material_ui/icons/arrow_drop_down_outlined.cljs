(ns reagent-material-ui.icons.arrow-drop-down-outlined
  "Imports @material-ui/icons/ArrowDropDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-drop-down-outlined (create-svg-icon (e "path" #js {"d" "m7 10 5 5 5-5H7z"})
                                               "ArrowDropDownOutlined"))

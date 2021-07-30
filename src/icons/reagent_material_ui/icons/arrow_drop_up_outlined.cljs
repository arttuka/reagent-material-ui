(ns reagent-material-ui.icons.arrow-drop-up-outlined
  "Imports @material-ui/icons/ArrowDropUpOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-drop-up-outlined (create-svg-icon (e "path" #js {"d" "m7 14 5-5 5 5H7z"})
                                             "ArrowDropUpOutlined"))

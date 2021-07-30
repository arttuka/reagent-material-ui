(ns reagent-material-ui.icons.arrow-upward-outlined
  "Imports @material-ui/icons/ArrowUpwardOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-upward-outlined (create-svg-icon (e "path" #js {"d" "m4 12 1.41 1.41L11 7.83V20h2V7.83l5.58 5.59L20 12l-8-8-8 8z"})
                                            "ArrowUpwardOutlined"))

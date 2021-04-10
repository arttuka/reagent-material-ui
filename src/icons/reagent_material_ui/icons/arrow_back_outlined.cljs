(ns reagent-material-ui.icons.arrow-back-outlined
  "Imports @material-ui/icons/ArrowBackOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-back-outlined (create-svg-icon (e "path" #js {"d" "M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z"})
                                          "ArrowBackOutlined"))

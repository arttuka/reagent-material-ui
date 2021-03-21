(ns reagent-material-ui.icons.align-vertical-center-outlined
  "Imports @material-ui/icons/AlignVerticalCenterOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def align-vertical-center-outlined (create-svg-icon (e "path" #js {"d" "M22 11h-5V6h-3v5h-4V3H7v8H1.84v2H7v8h3v-8h4v5h3v-5h5z"})
                                                     "AlignVerticalCenterOutlined"))

(ns reagent-material-ui.icons.keyboard-arrow-left-outlined
  "Imports @material-ui/icons/KeyboardArrowLeftOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-arrow-left-outlined (create-svg-icon (e "path" #js {"d" "M15.41 16.59 10.83 12l4.58-4.59L14 6l-6 6 6 6 1.41-1.41z"})
                                                   "KeyboardArrowLeftOutlined"))

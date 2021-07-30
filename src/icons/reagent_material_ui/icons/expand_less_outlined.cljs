(ns reagent-material-ui.icons.expand-less-outlined
  "Imports @material-ui/icons/ExpandLessOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def expand-less-outlined (create-svg-icon (e "path" #js {"d" "m12 8-6 6 1.41 1.41L12 10.83l4.59 4.58L18 14l-6-6z"})
                                           "ExpandLessOutlined"))

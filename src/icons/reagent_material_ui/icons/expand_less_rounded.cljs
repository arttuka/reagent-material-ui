(ns reagent-material-ui.icons.expand-less-rounded
  "Imports @material-ui/icons/ExpandLessRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def expand-less-rounded (create-svg-icon (e "path" #js {"d" "M7.71 15.29l3.88-3.88 3.88 3.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-4.59-4.59a.9959.9959 0 0 0-1.41 0l-4.59 4.59c-.39.39-.39 1.02 0 1.41.39.38 1.03.39 1.42 0z"})
                                          "ExpandLessRounded"))

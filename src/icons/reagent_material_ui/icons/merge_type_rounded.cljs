(ns reagent-material-ui.icons.merge-type-rounded
  "Imports @material-ui/icons/MergeTypeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def merge-type-rounded (create-svg-icon (e "path" #js {"d" "M9 15.59L10.41 17l-2.3 2.3c-.39.39-1.02.39-1.41 0a.9959.9959 0 0 1 0-1.41l2.3-2.3zm3.35-12.24l3.79 3.79c.32.32.1.86-.35.86H13v5.59l4.3 4.3c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0L11 14.41V8H8.21c-.45 0-.67-.54-.36-.85l3.79-3.79c.2-.2.52-.2.71-.01z"})
                                         "MergeTypeRounded"))

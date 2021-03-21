(ns reagent-material-ui.icons.filter-alt-rounded
  "Imports @material-ui/icons/FilterAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-alt-rounded (create-svg-icon (e "path" #js {"d" "M4.21 5.61C6.23 8.2 10 13 10 13v5c0 1.1.9 2 2 2s2-.9 2-2v-5s3.77-4.8 5.79-7.39C20.3 4.95 19.83 4 19 4H5c-.83 0-1.3.95-.79 1.61z"})
                                         "FilterAltRounded"))

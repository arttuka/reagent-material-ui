(ns reagent-material-ui.icons.chevron-right
  "Imports @material-ui/icons/ChevronRight as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def chevron-right (create-svg-icon (e "path" #js {"d" "M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"})
                                    "ChevronRight"))

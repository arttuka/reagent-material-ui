(ns reagent-material-ui.icons.reorder-two-tone
  "Imports @material-ui/icons/ReorderTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def reorder-two-tone (create-svg-icon (e "path" #js {"d" "M3 15h18v-2H3v2zm0 4h18v-2H3v2zm0-8h18V9H3v2zm0-6v2h18V5H3z"})
                                       "ReorderTwoTone"))

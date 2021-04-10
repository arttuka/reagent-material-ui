(ns reagent-material-ui.icons.format-strikethrough-sharp
  "Imports @material-ui/icons/FormatStrikethroughSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-strikethrough-sharp (create-svg-icon (e "path" #js {"d" "M10 19h4v-3h-4v3zM5 4v3h5v3h4V7h5V4H5zM3 14h18v-2H3v2z"})
                                                 "FormatStrikethroughSharp"))

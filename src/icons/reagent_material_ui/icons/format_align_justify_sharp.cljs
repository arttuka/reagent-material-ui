(ns reagent-material-ui.icons.format-align-justify-sharp
  "Imports @material-ui/icons/FormatAlignJustifySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-align-justify-sharp (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18V7H3v2zm0-6v2h18V3H3z"})
                                                 "FormatAlignJustifySharp"))

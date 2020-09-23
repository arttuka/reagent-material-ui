(ns reagent-material-ui.icons.format-align-right-sharp
  "Imports @material-ui/icons/FormatAlignRightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-right-sharp (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zm6-4h12v-2H9v2zm-6-4h18v-2H3v2zm6-4h12V7H9v2zM3 3v2h18V3H3z"})
                                               "FormatAlignRightSharp"))

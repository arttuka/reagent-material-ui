(ns reagent-material-ui.icons.format-align-justify-two-tone
  "Imports @material-ui/icons/FormatAlignJustifyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-justify-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm0 8h18v2H3zm0 8h18v2H3zm0-4h18v2H3zm0-8h18v2H3z"})
                                                    "FormatAlignJustifyTwoTone"))

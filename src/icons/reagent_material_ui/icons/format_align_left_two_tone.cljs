(ns reagent-material-ui.icons.format-align-left-two-tone
  "Imports @material-ui/icons/FormatAlignLeftTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-align-left-two-tone (create-svg-icon (e "path" #js {"d" "M3 19h18v2H3zM3 7h12v2H3zm0-4h18v2H3zm0 12h12v2H3zm0-4h18v2H3z"})
                                                 "FormatAlignLeftTwoTone"))

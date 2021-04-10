(ns reagent-material-ui.icons.format-align-right-two-tone
  "Imports @material-ui/icons/FormatAlignRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-align-right-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm0 16h18v2H3zm0-8h18v2H3zm6 4h12v2H9zm0-8h12v2H9z"})
                                                  "FormatAlignRightTwoTone"))

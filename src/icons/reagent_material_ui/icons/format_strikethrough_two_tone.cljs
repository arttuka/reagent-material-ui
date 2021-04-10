(ns reagent-material-ui.icons.format-strikethrough-two-tone
  "Imports @material-ui/icons/FormatStrikethroughTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-strikethrough-two-tone (create-svg-icon (e "path" #js {"d" "M3 12h18v2H3zm11-2V7h5V4H5v3h5v3zm-4 6h4v3h-4z"})
                                                    "FormatStrikethroughTwoTone"))

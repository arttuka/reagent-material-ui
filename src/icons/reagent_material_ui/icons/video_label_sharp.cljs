(ns reagent-material-ui.icons.video-label-sharp
  "Imports @material-ui/icons/VideoLabelSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def video-label-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 13H3V5h18v11z"})
                                        "VideoLabelSharp"))

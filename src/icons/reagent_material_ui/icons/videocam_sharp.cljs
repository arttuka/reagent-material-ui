(ns reagent-material-ui.icons.videocam-sharp
  "Imports @material-ui/icons/VideocamSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def videocam-sharp (create-svg-icon (e "path" #js {"d" "M17 10.5V6H3v12h14v-4.5l4 4v-11l-4 4z"})
                                     "VideocamSharp"))

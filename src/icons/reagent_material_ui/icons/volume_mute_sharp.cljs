(ns reagent-material-ui.icons.volume-mute-sharp
  "Imports @material-ui/icons/VolumeMuteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def volume-mute-sharp (create-svg-icon (e "path" #js {"d" "M7 9v6h4l5 5V4l-5 5H7z"})
                                        "VolumeMuteSharp"))

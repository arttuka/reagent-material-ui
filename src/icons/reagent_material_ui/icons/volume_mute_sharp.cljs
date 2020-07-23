(ns reagent-material-ui.icons.volume-mute-sharp
  "Imports @material-ui/icons/VolumeMuteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def volume-mute-sharp (create-svg-icon (e "path" #js {"d" "M7 9v6h4l5 5V4l-5 5H7z"})
                                        "VolumeMuteSharp"))

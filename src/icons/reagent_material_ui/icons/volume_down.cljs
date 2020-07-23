(ns reagent-material-ui.icons.volume-down
  "Imports @material-ui/icons/VolumeDown as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def volume-down (create-svg-icon (e "path" #js {"d" "M18.5 12c0-1.77-1.02-3.29-2.5-4.03v8.05c1.48-.73 2.5-2.25 2.5-4.02zM5 9v6h4l5 5V4L9 9H5z"})
                                  "VolumeDown"))

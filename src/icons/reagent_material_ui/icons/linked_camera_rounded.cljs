(ns reagent-material-ui.icons.linked-camera-rounded
  "Imports @material-ui/icons/LinkedCameraRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def linked-camera-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "13", "r" "2.5", "cx" "12"}) (e "path" #js {"d" "M16.6 2.37c2.1.27 3.77 1.93 4.03 4.03.04.34.32.6.66.6.39 0 .71-.34.66-.73-.33-2.72-2.5-4.89-5.22-5.22-.39-.05-.73.27-.73.66 0 .34.26.62.6.66zm2.63 3.82a3.338 3.338 0 0 0-2.42-2.42c-.41-.1-.81.22-.81.65 0 .29.19.57.48.64.72.18 1.29.74 1.46 1.46.07.29.34.48.64.48.43 0 .75-.4.65-.81z"}) (e "path" #js {"d" "M17 8c0-1.1-.9-2-2-2V4c0-.55-.45-1-1-1H9.88c-.56 0-1.1.24-1.48.65L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2v-9c0-1.1-.9-2-2-2h-3zm-5 9.5c-2.48 0-4.5-2.02-4.5-4.5S9.52 8.5 12 8.5s4.5 2.02 4.5 4.5-2.02 4.5-4.5 4.5z"}))
                                            "LinkedCameraRounded"))

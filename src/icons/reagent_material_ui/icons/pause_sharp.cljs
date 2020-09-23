(ns reagent-material-ui.icons.pause-sharp
  "Imports @material-ui/icons/PauseSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def pause-sharp (create-svg-icon (e "path" #js {"d" "M6 19h4V5H6v14zm8-14v14h4V5h-4z"})
                                  "PauseSharp"))

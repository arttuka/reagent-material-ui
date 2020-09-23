(ns reagent-material-ui.icons.push-pin-sharp
  "Imports @material-ui/icons/PushPinSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def push-pin-sharp (create-svg-icon (e "path" #js {"d" "M16 9V4h2V2H6v2h2v5c0 1.66-1.34 3-3 3v2h5.97v7l1 1 1-1v-7H19v-2c-1.66 0-3-1.34-3-3z", "fillRule" "evenodd"})
                                     "PushPinSharp"))

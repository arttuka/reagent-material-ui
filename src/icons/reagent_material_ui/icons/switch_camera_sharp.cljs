(ns reagent-material-ui.icons.switch-camera-sharp
  "Imports @material-ui/icons/SwitchCameraSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def switch-camera-sharp (create-svg-icon (e "path" #js {"d" "M22 4h-5.17L15 2H9L7.17 4H2v16h20V4zm-7 11.5V13H9v2.5L5.5 12 9 8.5V11h6V8.5l3.5 3.5-3.5 3.5z"})
                                          "SwitchCameraSharp"))

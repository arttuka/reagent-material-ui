(ns reagent-material-ui.icons.camera-outdoor-sharp
  "Imports @material-ui/icons/CameraOutdoorSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def camera-outdoor-sharp (create-svg-icon (e "path" #js {"d" "M18 14v-2h-6v6h6v-2l2 1.06v-4.12L18 14zM12 3 4 9v12h16v-2H6v-9l6-4.5 6 4.5v1h2V9l-8-6z"})
                                           "CameraOutdoorSharp"))

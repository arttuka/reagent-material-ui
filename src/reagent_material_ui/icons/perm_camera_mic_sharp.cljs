(ns reagent-material-ui.icons.perm-camera-mic-sharp
  "Imports @material-ui/icons/PermCameraMicSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def perm-camera-mic-sharp (create-svg-icon (e "path" #js {"d" "M22 5h-5.17L15 3H9L7.17 5H2v16h9v-2.09c-2.83-.48-5-2.94-5-5.91h2c0 2.21 1.79 4 4 4s4-1.79 4-4h2c0 2.97-2.17 5.43-5 5.91V21h9V5zm-8 8c0 1.1-.9 2-2 2s-2-.9-2-2V9c0-1.1.9-2 2-2s2 .9 2 2v4z"})
                                            "PermCameraMicSharp"))

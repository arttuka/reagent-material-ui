(ns reagent-material-ui.icons.fullscreen-sharp
  "Imports @material-ui/icons/FullscreenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fullscreen-sharp (create-svg-icon (e "path" #js {"d" "M7 14H5v5h5v-2H7v-3zm-2-4h2V7h3V5H5v5zm12 7h-3v2h5v-5h-2v3zM14 5v2h3v3h2V5h-5z"})
                                       "FullscreenSharp"))

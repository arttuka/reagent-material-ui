(ns reagent-material-ui.icons.vertical-align-center-sharp
  "Imports @material-ui/icons/VerticalAlignCenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-align-center-sharp (create-svg-icon (e "path" #js {"d" "M8 19h3v4h2v-4h3l-4-4-4 4zm8-14h-3V1h-2v4H8l4 4 4-4zM4 11v2h16v-2H4z"})
                                                  "VerticalAlignCenterSharp"))

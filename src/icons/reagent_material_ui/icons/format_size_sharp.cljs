(ns reagent-material-ui.icons.format-size-sharp
  "Imports @material-ui/icons/FormatSizeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-size-sharp (create-svg-icon (e "path" #js {"d" "M9 4v3h5v12h3V7h5V4H9zm-6 8h3v7h3v-7h3V9H3v3z"})
                                        "FormatSizeSharp"))

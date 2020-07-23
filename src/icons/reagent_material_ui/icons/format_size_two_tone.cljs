(ns reagent-material-ui.icons.format-size-two-tone
  "Imports @material-ui/icons/FormatSizeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-size-two-tone (create-svg-icon (e "path" #js {"d" "M3 12h3v7h3v-7h3V9H3zm6-5h5v12h3V7h5V4H9z"})
                                           "FormatSizeTwoTone"))

(ns reagent-material-ui.icons.align-vertical-bottom-two-tone
  "Imports @material-ui/icons/AlignVerticalBottomTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-vertical-bottom-two-tone (create-svg-icon (e "path" #js {"d" "M22 22H2v-2h20v2zM10 2H7v16h3V2zm7 6h-3v10h3V8z"})
                                                     "AlignVerticalBottomTwoTone"))

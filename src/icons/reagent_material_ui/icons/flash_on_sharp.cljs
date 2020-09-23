(ns reagent-material-ui.icons.flash-on-sharp
  "Imports @material-ui/icons/FlashOnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flash-on-sharp (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l3-8z"})
                                     "FlashOnSharp"))

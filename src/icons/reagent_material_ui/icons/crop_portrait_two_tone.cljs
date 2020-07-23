(ns reagent-material-ui.icons.crop-portrait-two-tone
  "Imports @material-ui/icons/CropPortraitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-portrait-two-tone (create-svg-icon (e "path" #js {"d" "M17 3H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H7V5h10v14z"})
                                             "CropPortraitTwoTone"))

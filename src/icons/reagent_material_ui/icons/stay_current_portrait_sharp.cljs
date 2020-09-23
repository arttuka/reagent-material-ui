(ns reagent-material-ui.icons.stay-current-portrait-sharp
  "Imports @material-ui/icons/StayCurrentPortraitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-current-portrait-sharp (create-svg-icon (e "path" #js {"d" "M19 1.01L5.01 1v22H19V1.01zM17 19H7V5h10v14z"})
                                                  "StayCurrentPortraitSharp"))

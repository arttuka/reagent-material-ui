(ns reagent-material-ui.icons.stay-primary-portrait-sharp
  "Imports @material-ui/icons/StayPrimaryPortraitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-primary-portrait-sharp (create-svg-icon (e "path" #js {"d" "M5.01 1v22H19V1H5.01zM17 19H7V5h10v14z"})
                                                  "StayPrimaryPortraitSharp"))

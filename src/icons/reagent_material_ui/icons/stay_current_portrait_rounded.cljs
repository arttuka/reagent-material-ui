(ns reagent-material-ui.icons.stay-current-portrait-rounded
  "Imports @material-ui/icons/StayCurrentPortraitRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stay-current-portrait-rounded (create-svg-icon (e "path" #js {"d" "M17 1.01L7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 18H7V6h10v12z"})
                                                    "StayCurrentPortraitRounded"))

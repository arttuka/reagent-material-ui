(ns reagent-material-ui.icons.sd-card-sharp
  "Imports @material-ui/icons/SdCardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sd-card-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-8 6h-2V4h2v4zm3 0h-2V4h2v4zm3 0h-2V4h2v4z"})
                                    "SdCardSharp"))

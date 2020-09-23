(ns reagent-material-ui.icons.crop-square-sharp
  "Imports @material-ui/icons/CropSquareSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-square-sharp (create-svg-icon (e "path" #js {"d" "M20 4H4v16h16V4zm-2 14H6V6h12v12z"})
                                        "CropSquareSharp"))

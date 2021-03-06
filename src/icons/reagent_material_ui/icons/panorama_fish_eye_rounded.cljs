(ns reagent-material-ui.icons.panorama-fish-eye-rounded
  "Imports @material-ui/icons/PanoramaFishEyeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def panorama-fish-eye-rounded (create-svg-icon (e "circle" #js {"cy" "12", "r" "10", "cx" "12"})
                                                "PanoramaFishEyeRounded"))

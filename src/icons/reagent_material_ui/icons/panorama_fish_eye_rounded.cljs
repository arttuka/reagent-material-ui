(ns reagent-material-ui.icons.panorama-fish-eye-rounded
  "Imports @material-ui/icons/PanoramaFishEyeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def panorama-fish-eye-rounded (create-svg-icon (e "circle" #js {"cy" "12", "r" "10", "cx" "12"})
                                                "PanoramaFishEyeRounded"))

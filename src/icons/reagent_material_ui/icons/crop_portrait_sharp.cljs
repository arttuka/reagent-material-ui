(ns reagent-material-ui.icons.crop-portrait-sharp
  "Imports @material-ui/icons/CropPortraitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-portrait-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18h14V3zm-2 16H7V5h10v14z"})
                                          "CropPortraitSharp"))

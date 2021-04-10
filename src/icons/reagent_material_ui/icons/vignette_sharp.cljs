(ns reagent-material-ui.icons.vignette-sharp
  "Imports @material-ui/icons/VignetteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vignette-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zM12 18c-4.42 0-8-2.69-8-6s3.58-6 8-6 8 2.69 8 6-3.58 6-8 6z"})
                                     "VignetteSharp"))

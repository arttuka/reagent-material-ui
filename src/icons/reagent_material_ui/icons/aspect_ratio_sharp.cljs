(ns reagent-material-ui.icons.aspect-ratio-sharp
  "Imports @material-ui/icons/AspectRatioSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def aspect-ratio-sharp (create-svg-icon (e "path" #js {"d" "M19 12h-2v3h-3v2h5v-5zM7 9h3V7H5v5h2V9zm16-6H1v18h22V3zm-2 16.01H3V4.99h18v14.02z"})
                                         "AspectRatioSharp"))

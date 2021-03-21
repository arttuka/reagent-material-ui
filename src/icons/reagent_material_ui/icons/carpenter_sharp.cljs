(ns reagent-material-ui.icons.carpenter-sharp
  "Imports @material-ui/icons/CarpenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def carpenter-sharp (create-svg-icon (e "path" #js {"d" "M7 1.5L3.11 5.39l8.13 11.67-1.41 1.41 4.24 4.24 7.07-7.07L7 1.5zm5.66 16.97l4.24-4.24 1.41 1.41-4.24 4.24-1.41-1.41z"})
                                      "CarpenterSharp"))

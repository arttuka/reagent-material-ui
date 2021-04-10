(ns reagent-material-ui.icons.details-sharp
  "Imports @material-ui/icons/DetailsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def details-sharp (create-svg-icon (e "path" #js {"d" "M3 4l9 16 9-16H3zm3.38 2h11.25L12 16 6.38 6z"})
                                    "DetailsSharp"))

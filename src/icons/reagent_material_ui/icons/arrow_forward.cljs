(ns reagent-material-ui.icons.arrow-forward
  "Imports @material-ui/icons/ArrowForward as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-forward (create-svg-icon (e "path" #js {"d" "m12 4-1.41 1.41L16.17 11H4v2h12.17l-5.58 5.59L12 20l8-8z"})
                                    "ArrowForward"))

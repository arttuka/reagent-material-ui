(ns reagent-material-ui.icons.label-off-sharp
  "Imports @material-ui/icons/LabelOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def label-off-sharp (create-svg-icon (e "path" #js {"d" "M22 12l-4.97-7H8.66l10.7 10.73zM2 4l1 1v14h14l2 2 1.41-1.41L3.44 2.62z"})
                                      "LabelOffSharp"))

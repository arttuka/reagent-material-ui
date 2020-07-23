(ns reagent-material-ui.icons.cast-for-education
  "Imports @material-ui/icons/CastForEducation as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def cast-for-education (create-svg-icon (e "path" #js {"d" "M42 6H6c-2.2 0-4 1.8-4 4v6h4v-6h36v28H28v4h14c2.2 0 4-1.8 4-4V10c0-2.2-1.8-4-4-4zM2 36v6h6c0-3.32-2.68-6-6-6zm0-8v4c5.52 0 10 4.48 10 10h4c0-7.74-6.26-14-14-14zm0-8v4c9.94 0 18 8.06 18 18h4c0-12.16-9.86-22-22-22zm20 2.18v4L29 30l7-3.82v-4L29 26l-7-3.82zM29 12l-11 6 11 6 11-6-11-6z", "transform" "scale(0.5, 0.5)"})
                                         "CastForEducation"))

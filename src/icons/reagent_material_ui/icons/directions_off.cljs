(ns reagent-material-ui.icons.directions-off
  "Imports @material-ui/icons/DirectionsOff as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def directions-off (create-svg-icon [(e "path" #js {"d" "M9.41 6.58 12 4l8 8-2.58 2.59L18.83 16l2.58-2.59c.78-.78.78-2.05 0-2.83l-8-8c-.78-.78-2.05-.78-2.83 0L8 5.17l1.41 1.41zm-6.6-3.77L1.39 4.22 5.17 8l-2.58 2.59c-.78.78-.78 2.05 0 2.83l8 8c.78.78 2.05.78 2.83 0L16 18.83l3.78 3.78 1.41-1.41L2.81 2.81zM12 20l-8-8 2.58-2.59L8.17 11H7v2h3.17l1.5 1.5-1.08 1.09L12 17l1.09-1.09 1.5 1.5L12 20z"}) (e "path" #js {"d" "m10.9165 8.0872 1.089-1.089 4.9992 4.9993-1.089 1.089z"})]
                                     "DirectionsOff"))

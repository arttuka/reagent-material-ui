(ns reagent-material-ui.icons.edit-off-sharp
  "Imports @material-ui/icons/EditOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-off-sharp (create-svg-icon (e "path" #js {"d" "M21.41 6.33l-3.75-3.75-2.53 2.54 3.75 3.75 2.53-2.54zM1.39 4.22l7.32 7.32L3 17.25V21h3.75l5.71-5.71 7.32 7.32 1.41-1.41L2.81 2.81 1.39 4.22zm16.42 5.72l-3.75-3.75-2.52 2.52 3.75 3.75 2.52-2.52z"})
                                     "EditOffSharp"))

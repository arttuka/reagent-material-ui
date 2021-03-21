(ns reagent-material-ui.icons.near-me-disabled
  "Imports @material-ui/icons/NearMeDisabled as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def near-me-disabled (create-svg-icon (e "path" #js {"d" "M12 6.34L21 3l-3.34 9L12 6.34zm10.61 13.44L4.22 1.39 2.81 2.81l5.07 5.07L3 9.69v1.41l7.07 2.83L12.9 21h1.41l1.81-4.88 5.07 5.07 1.42-1.41z"})
                                       "NearMeDisabled"))

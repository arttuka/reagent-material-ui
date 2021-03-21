(ns reagent-material-ui.icons.near-me-sharp
  "Imports @material-ui/icons/NearMeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def near-me-sharp (create-svg-icon (e "path" #js {"d" "M21 3L3 10.53v.98l6.84 2.65L12.48 21h.98L21 3z"})
                                    "NearMeSharp"))

(ns reagent-material-ui.icons.vignette-rounded
  "Imports @material-ui/icons/VignetteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vignette-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-8 12c-3.25 0-6-1.83-6-4s2.75-4 6-4 6 1.83 6 4-2.75 4-6 4z"})
                                       "VignetteRounded"))

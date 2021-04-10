(ns reagent-material-ui.icons.stay-current-landscape-sharp
  "Imports @material-ui/icons/StayCurrentLandscapeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stay-current-landscape-sharp (create-svg-icon (e "path" #js {"d" "M1 19h22V5H1v14zM19 7v10H5V7h14z"})
                                                   "StayCurrentLandscapeSharp"))

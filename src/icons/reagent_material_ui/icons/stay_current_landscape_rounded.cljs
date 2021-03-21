(ns reagent-material-ui.icons.stay-current-landscape-rounded
  "Imports @material-ui/icons/StayCurrentLandscapeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stay-current-landscape-rounded (create-svg-icon (e "path" #js {"d" "M1.01 7L1 17c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2H3c-1.1 0-1.99.9-1.99 2zM18 7v10H6V7h12z"})
                                                     "StayCurrentLandscapeRounded"))

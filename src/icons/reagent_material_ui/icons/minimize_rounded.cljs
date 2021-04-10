(ns reagent-material-ui.icons.minimize-rounded
  "Imports @material-ui/icons/MinimizeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def minimize-rounded (create-svg-icon (e "path" #js {"d" "M7 19h10c.55 0 1 .45 1 1s-.45 1-1 1H7c-.55 0-1-.45-1-1s.45-1 1-1z"})
                                       "MinimizeRounded"))

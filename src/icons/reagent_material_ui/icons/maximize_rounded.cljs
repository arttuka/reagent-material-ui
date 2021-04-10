(ns reagent-material-ui.icons.maximize-rounded
  "Imports @material-ui/icons/MaximizeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def maximize-rounded (create-svg-icon (e "path" #js {"d" "M4 3h16c.55 0 1 .45 1 1s-.45 1-1 1H4c-.55 0-1-.45-1-1s.45-1 1-1z"})
                                       "MaximizeRounded"))

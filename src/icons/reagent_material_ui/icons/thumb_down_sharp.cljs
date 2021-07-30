(ns reagent-material-ui.icons.thumb-down-sharp
  "Imports @material-ui/icons/ThumbDownSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def thumb-down-sharp (create-svg-icon (e "path" #js {"d" "M9.83 23 17 15.82V3H4.69L1 11.6V16h8.31l-1.12 5.38zM19 3h4v12h-4z"})
                                       "ThumbDownSharp"))

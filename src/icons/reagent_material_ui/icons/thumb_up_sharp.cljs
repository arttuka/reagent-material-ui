(ns reagent-material-ui.icons.thumb-up-sharp
  "Imports @material-ui/icons/ThumbUpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def thumb-up-sharp (create-svg-icon (e "path" #js {"d" "M14.17 1 7 8.18V21h12.31L23 12.4V8h-8.31l1.12-5.38zM1 9h4v12H1z"})
                                     "ThumbUpSharp"))

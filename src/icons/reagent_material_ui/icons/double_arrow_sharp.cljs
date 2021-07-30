(ns reagent-material-ui.icons.double-arrow-sharp
  "Imports @material-ui/icons/DoubleArrowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def double-arrow-sharp (create-svg-icon [(e "path" #js {"d" "M15.5 5H11l5 7-5 7h4.5l5-7z"}) (e "path" #js {"d" "M8.5 5H4l5 7-5 7h4.5l5-7z"})]
                                         "DoubleArrowSharp"))

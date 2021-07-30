(ns reagent-material-ui.icons.done-sharp
  "Imports @material-ui/icons/DoneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def done-sharp (create-svg-icon (e "path" #js {"d" "M9 16.2 4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z"})
                                 "DoneSharp"))

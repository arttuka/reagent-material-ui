(ns reagent-material-ui.icons.polymer-two-tone
  "Imports @material-ui/icons/PolymerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def polymer-two-tone (create-svg-icon (e "path" #js {"d" "M19 4h-4L7.11 16.63 4.5 12 9 4H5L.5 12 5 20h4l7.89-12.63L19.5 12 15 20h4l4.5-8L19 4z"})
                                       "PolymerTwoTone"))

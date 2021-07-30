(ns reagent-material-ui.icons.check-two-tone
  "Imports @material-ui/icons/CheckTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def check-two-tone (create-svg-icon (e "path" #js {"d" "M9 16.17 4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41L9 16.17z"})
                                     "CheckTwoTone"))

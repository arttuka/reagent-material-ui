(ns reagent-material-ui.icons.school-sharp
  "Imports @material-ui/icons/SchoolSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def school-sharp (create-svg-icon (e "path" #js {"d" "M5 13.18v4L12 21l7-3.82v-4L12 17l-7-3.82zM12 3L1 9l11 6 9-4.91V17h2V9L12 3z"})
                                   "SchoolSharp"))

(ns reagent-material-ui.icons.today-sharp
  "Imports @material-ui/icons/TodaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def today-sharp (create-svg-icon (e "path" #js {"d" "M21 3h-3V1h-2v2H8V1H6v2H3v18h18V3zm-2 16H5V8h14v11zM7 10h5v5H7v-5z"})
                                  "TodaySharp"))

(ns reagent-material-ui.icons.hourglass-full-sharp
  "Imports @material-ui/icons/HourglassFullSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hourglass-full-sharp (create-svg-icon (e "path" #js {"d" "M6 2v6h.01L6 8.01 10 12l-4 4 .01.01H6V22h12v-5.99h-.01L18 16l-4-4 4-3.99-.01-.01H18V2H6z"})
                                           "HourglassFullSharp"))

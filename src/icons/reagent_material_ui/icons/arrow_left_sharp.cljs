(ns reagent-material-ui.icons.arrow-left-sharp
  "Imports @material-ui/icons/ArrowLeftSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-left-sharp (create-svg-icon (e "path" #js {"d" "M14 7l-5 5 5 5V7z"})
                                       "ArrowLeftSharp"))

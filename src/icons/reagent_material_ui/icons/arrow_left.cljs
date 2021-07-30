(ns reagent-material-ui.icons.arrow-left
  "Imports @material-ui/icons/ArrowLeft as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-left (create-svg-icon (e "path" #js {"d" "m14 7-5 5 5 5V7z"})
                                 "ArrowLeft"))

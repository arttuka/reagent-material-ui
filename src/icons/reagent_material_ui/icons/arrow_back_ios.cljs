(ns reagent-material-ui.icons.arrow-back-ios
  "Imports @material-ui/icons/ArrowBackIos as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-back-ios (create-svg-icon (e "path" #js {"d" "M11.67 3.87L9.9 2.1 0 12l9.9 9.9 1.77-1.77L3.54 12z"})
                                     "ArrowBackIos"))

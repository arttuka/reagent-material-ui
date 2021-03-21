(ns reagent-material-ui.icons.arrow-back-ios-two-tone
  "Imports @material-ui/icons/ArrowBackIosTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-back-ios-two-tone (create-svg-icon (e "path" #js {"d" "M17.51 3.87L15.73 2.1 5.84 12l9.9 9.9 1.77-1.77L9.38 12l8.13-8.13z"})
                                              "ArrowBackIosTwoTone"))

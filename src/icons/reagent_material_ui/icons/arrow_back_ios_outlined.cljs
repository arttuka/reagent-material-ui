(ns reagent-material-ui.icons.arrow-back-ios-outlined
  "Imports @material-ui/icons/ArrowBackIosOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-back-ios-outlined (create-svg-icon (e "path" #js {"d" "M17.51 3.87L15.73 2.1 5.84 12l9.9 9.9 1.77-1.77L9.38 12l8.13-8.13z"})
                                              "ArrowBackIosOutlined"))

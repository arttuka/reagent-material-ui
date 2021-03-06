(ns reagent-material-ui.icons.wb-shade
  "Imports @material-ui/icons/WbShade as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def wb-shade (create-svg-icon (e "path" #js {"d" "M14 12v2.5l5.5 5.5H22zm0 8h3l-3-3zM8 4l-6 6h2v10h8V10h2L8 4zm1 10H7v-4h2v4z"})
                               "WbShade"))

(ns reagent-material-ui.icons.mouse-rounded
  "Imports @material-ui/icons/MouseRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mouse-rounded (create-svg-icon (e "path" #js {"d" "M13 9h6c0-3.53-2.61-6.43-6-6.92V9zm-8 2v4c0 3.87 3.13 7 7 7s7-3.13 7-7v-4H5zm6-8.92C7.61 2.57 5 5.47 5 9h6V2.08z"})
                                    "MouseRounded"))

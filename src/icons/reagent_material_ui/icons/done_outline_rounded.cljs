(ns reagent-material-ui.icons.done-outline-rounded
  "Imports @material-ui/icons/DoneOutlineRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def done-outline-rounded (create-svg-icon (e "path" #js {"d" "M18.69 5.99l1.43 1.4L9.52 18l-5.66-5.66 1.41-1.41 4.24 4.24 9.18-9.18m-9.17 6.35L6.69 9.51c-.78-.78-2.05-.78-2.83 0l-1.42 1.41c-.78.78-.78 2.05 0 2.83l5.66 5.66c.78.78 2.05.78 2.83 0L21.54 8.8c.79-.79.78-2.07-.02-2.84l-1.43-1.4c-.78-.77-2.04-.76-2.81.02l-7.76 7.76z"})
                                           "DoneOutlineRounded"))

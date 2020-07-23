(ns reagent-material-ui.icons.photo-size-select-actual-sharp
  "Imports @material-ui/icons/PhotoSizeSelectActualSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-size-select-actual-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zM5 17l3.5-4.5 2.5 3.01L14.5 11l4.5 6H5z"})
                                                     "PhotoSizeSelectActualSharp"))

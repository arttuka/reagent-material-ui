(ns reagent-material-ui.icons.photo-size-select-actual
  "Imports @material-ui/icons/PhotoSizeSelectActual as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def photo-size-select-actual (create-svg-icon (e "path" #js {"d" "M21 3H3C2 3 1 4 1 5v14c0 1.1.9 2 2 2h18c1 0 2-1 2-2V5c0-1-1-2-2-2zM5 17l3.5-4.5 2.5 3.01L14.5 11l4.5 6H5z"})
                                               "PhotoSizeSelectActual"))

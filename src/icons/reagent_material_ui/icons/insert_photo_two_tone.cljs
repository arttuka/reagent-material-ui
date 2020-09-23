(ns reagent-material-ui.icons.insert-photo-two-tone
  "Imports @material-ui/icons/InsertPhotoTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-photo-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14V5H5v14zm4-5.86l2.14 2.58 3-3.87L18 17H6l3-3.86z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2zm16 14H5V5h14v14zm-4.86-7.14l-3 3.86L9 13.14 6 17h12z"}))
                                            "InsertPhotoTwoTone"))

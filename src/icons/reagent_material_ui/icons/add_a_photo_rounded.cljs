(ns reagent-material-ui.icons.add-a-photo-rounded
  "Imports @material-ui/icons/AddAPhotoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-a-photo-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "14", "r" "2.5", "cx" "11"}) (e "path" #js {"d" "M21 4V3c0-.55-.45-1-1-1s-1 .45-1 1v1h-1c-.55 0-1 .45-1 1s.45 1 1 1h1v1c0 .55.45 1 1 1s1-.45 1-1V6h1c.55 0 1-.45 1-1s-.45-1-1-1h-1zm-4 4h-1c-.55 0-1-.45-1-1V4H8.88c-.56 0-1.1.24-1.48.65L6.17 6H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V10h-3c-.55 0-1-.45-1-1V8zm-6 10.5c-2.48 0-4.5-2.02-4.5-4.5S8.52 9.5 11 9.5s4.5 2.02 4.5 4.5-2.02 4.5-4.5 4.5z"}))
                                          "AddAPhotoRounded"))

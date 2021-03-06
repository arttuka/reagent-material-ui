(ns reagent-material-ui.icons.face-retouching-natural-sharp
  "Imports @material-ui/icons/FaceRetouchingNaturalSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def face-retouching-natural-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "13", "r" "1.25", "cx" "9"}) (e "path" #js {"d" "M19.85 10.59C20.79 15.4 17.01 20 12 20c-4.41 0-8-3.59-8-8 0-.39 3.87-1.12 5.74-5.69 3.42 4.19 8.07 3.73 9.09 3.59l-1.48-3.25-4.72-2.15 3.5-1.59C9.51-.14 2 4.77 2 12c0 5.52 4.48 10 10 10 7.21 0 12.12-7.45 9.1-14.13l-1.25 2.72z"}) (e "circle" #js {"cy" "13", "r" "1.25", "cx" "15"}) (e "path" #js {"d" "M20.6 5.6L19.5 8l-1.1-2.4L16 4.5l2.4-1.1L19.5 1l1.1 2.4L23 4.5l-2.4 1.1z"}))
                                                    "FaceRetouchingNaturalSharp"))

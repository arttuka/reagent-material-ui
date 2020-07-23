(ns reagent-material-ui.icons.local-see-sharp
  "Imports @material-ui/icons/LocalSeeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-see-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "3.2", "cx" "12"}) (e "path" #js {"d" "M22 4h-5.17L15 2H9L7.17 4H2v16h20V4zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}))
                                      "LocalSeeSharp"))

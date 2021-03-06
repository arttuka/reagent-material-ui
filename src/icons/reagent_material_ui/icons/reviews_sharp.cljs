(ns reagent-material-ui.icons.reviews-sharp
  "Imports @material-ui/icons/ReviewsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def reviews-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-8.43 9.57L12 15l-1.57-3.43L7 10l3.43-1.57L12 5l1.57 3.43L17 10l-3.43 1.57z"})
                                    "ReviewsSharp"))

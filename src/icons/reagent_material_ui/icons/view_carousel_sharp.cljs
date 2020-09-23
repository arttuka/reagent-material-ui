(ns reagent-material-ui.icons.view-carousel-sharp
  "Imports @material-ui/icons/ViewCarouselSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-carousel-sharp (create-svg-icon (e "path" #js {"d" "M7 19h10V4H7v15zm-5-2h4V6H2v11zM18 6v11h4V6h-4z"})
                                          "ViewCarouselSharp"))

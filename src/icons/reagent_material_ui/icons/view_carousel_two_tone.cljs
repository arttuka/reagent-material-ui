(ns reagent-material-ui.icons.view-carousel-two-tone
  "Imports @material-ui/icons/ViewCarouselTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-carousel-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 6h4v11h-4zM7 19h10V4H7v15zM9 6h6v11H9V6zM2 6h4v11H2z"}) (e "path" #js {"d" "M9 6h6v11H9z", "opacity" ".3"}))
                                             "ViewCarouselTwoTone"))

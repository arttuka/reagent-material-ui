(ns reagent-material-ui.icons.view-carousel
  "Imports @material-ui/icons/ViewCarousel as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-carousel (create-svg-icon (e "path" #js {"d" "M7 19h10V4H7v15zm-5-2h4V6H2v11zM18 6v11h4V6h-4z"})
                                    "ViewCarousel"))

(ns reagent-material-ui.icons.view-carousel-two-tone
  "Imports @material-ui/icons/ViewCarouselTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-carousel-two-tone (create-svg-icon [(e "path" #js {"d" "M9 7h6v10H9z", "opacity" ".3"}) (e "path" #js {"d" "M2 7h4v10H2V7zm5 12h10V5H7v14zM9 7h6v10H9V7zm9 0h4v10h-4V7z"})]
                                             "ViewCarouselTwoTone"))

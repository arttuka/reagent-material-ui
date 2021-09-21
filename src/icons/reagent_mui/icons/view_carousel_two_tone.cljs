(ns reagent-mui.icons.view-carousel-two-tone
  "Imports @mui/icons-material/ViewCarouselTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-carousel-two-tone (create-svg-icon [(e "path" #js {"d" "M9 7h6v10H9z", "opacity" ".3"}) (e "path" #js {"d" "M2 7h4v10H2V7zm5 12h10V5H7v14zM9 7h6v10H9V7zm9 0h4v10h-4V7z"})]
                                             "ViewCarouselTwoTone"))

(ns reagent-material-ui.icons.tour-two-tone
  "Imports @material-ui/icons/TourTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tour-two-tone (create-svg-icon [(e "path" #js {"d" "M7 12V6h11.05l-1.2 3 1.2 3z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H7V2H5v20h2v-8h14l-2-5 2-5zM7 12V6h11.05l-1.2 3 1.2 3H7zm7-3c0 1.1-.9 2-2 2s-2-.9-2-2 .9-2 2-2 2 .9 2 2z"})]
                                    "TourTwoTone"))

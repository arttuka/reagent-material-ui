(ns reagent-mui.icons.tour-two-tone
  "Imports @mui/icons-material/TourTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tour-two-tone (create-svg-icon [(e "path" #js {"d" "M7 12V6h11.05l-1.2 3 1.2 3z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H7V2H5v20h2v-8h14l-2-5 2-5zM7 12V6h11.05l-1.2 3 1.2 3H7zm7-3c0 1.1-.9 2-2 2s-2-.9-2-2 .9-2 2-2 2 .9 2 2z"})]
                                    "TourTwoTone"))

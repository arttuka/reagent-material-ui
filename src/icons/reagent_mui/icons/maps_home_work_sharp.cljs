(ns reagent-mui.icons.maps-home-work-sharp
  "Imports @mui/icons-material/MapsHomeWorkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def maps-home-work-sharp (create-svg-icon [(e "path" #js {"d" "M1 11v10h5v-6h4v6h5V11L8 6z"}) (e "path" #js {"d" "M10 3v1.97l7 5V11h2v2h-2v2h2v2h-2v4h6V3H10zm9 6h-2V7h2v2z"})]
                                           "MapsHomeWorkSharp"))

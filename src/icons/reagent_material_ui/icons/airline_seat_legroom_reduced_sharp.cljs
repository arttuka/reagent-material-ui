(ns reagent-material-ui.icons.airline-seat-legroom-reduced-sharp
  "Imports @material-ui/icons/AirlineSeatLegroomReducedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def airline-seat-legroom-reduced-sharp (create-svg-icon (e "path" #js {"d" "M19.97 21H14v-3l1-4H6V3h6v6h5c1.1 0 2 .9 2 2l-2 7h2.97v3zM5 15V3H3v14h9v-2H5z"})
                                                         "AirlineSeatLegroomReducedSharp"))

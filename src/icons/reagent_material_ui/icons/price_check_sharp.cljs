(ns reagent-material-ui.icons.price-check-sharp
  "Imports @material-ui/icons/PriceCheckSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def price-check-sharp (create-svg-icon (e "path" #js {"d" "M11 8H6V6h5V4H8.5V3h-2v1H4v6h5v2H4v2h2.5v1h2v-1H11zm8.59 4.52-5.66 5.65-2.83-2.83-1.41 1.42L13.93 21 21 13.93z"})
                                        "PriceCheckSharp"))

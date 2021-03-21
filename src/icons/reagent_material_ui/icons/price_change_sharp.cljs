(ns reagent-material-ui.icons.price-change-sharp
  "Imports @material-ui/icons/PriceChangeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def price-change-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm10 6H8v1h4v5h-2v1H8v-1H6v-2h4v-1H6V8h2V7h2v1h2v2zm4 6.25l-2-2h4l-2 2zM14 10l2-2 2 2h-4z"})
                                         "PriceChangeSharp"))

(ns reagent-material-ui.icons.price-check-outlined
  "Imports @material-ui/icons/PriceCheckOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def price-check-outlined (create-svg-icon (e "path" #js {"d" "M11 13V9c0-.55-.45-1-1-1H6V6h5V4H8.5V3h-2v1H5c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1h4v2H4v2h2.5v1h2v-1H10c.55 0 1-.45 1-1zm8.59-.48l-5.66 5.65-2.83-2.83-1.41 1.42L13.93 21 21 13.93z"})
                                           "PriceCheckOutlined"))

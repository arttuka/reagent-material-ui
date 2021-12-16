(ns reagent-mui.icons.currency-yen
  "Imports @mui/icons-material/CurrencyYen as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def currency-yen (create-svg-icon (e "path" #js {"d" "M13.92 11H18v2h-5v2h5v2h-5v4h-2v-4H6v-2h5v-2H6v-2h4.08L5 3h2.37L12 10.29 16.63 3H19z"})
                                   "CurrencyYen"))

(ns reagent-mui.icons.currency-yuan
  "Imports @mui/icons-material/CurrencyYuan as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def currency-yuan (create-svg-icon (e "path" #js {"d" "M13.28 12H18v2h-5v7h-2v-7H6v-2h4.72L5 3h2.37L12 10.29 16.63 3H19z"})
                                    "CurrencyYuan"))

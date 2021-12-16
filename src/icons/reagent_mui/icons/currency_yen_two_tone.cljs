(ns reagent-mui.icons.currency-yen-two-tone
  "Imports @mui/icons-material/CurrencyYenTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def currency-yen-two-tone (create-svg-icon (e "path" #js {"d" "M13.92 11H18v2h-5v2h5v2h-5v4h-2v-4H6v-2h5v-2H6v-2h4.08L5 3h2.37L12 10.29 16.63 3H19z"})
                                            "CurrencyYenTwoTone"))

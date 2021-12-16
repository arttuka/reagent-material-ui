(ns reagent-mui.icons.currency-franc-two-tone
  "Imports @mui/icons-material/CurrencyFrancTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def currency-franc-two-tone (create-svg-icon (e "path" #js {"d" "M18 5V3H7v13H5v2h2v3h2v-3h4v-2H9v-3h8v-2H9V5z"})
                                              "CurrencyFrancTwoTone"))

(ns reagent-mui.icons.candlestick-chart
  "Imports @mui/icons-material/CandlestickChart as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def candlestick-chart (create-svg-icon (e "path" #js {"d" "M9 4H7v2H5v12h2v2h2v-2h2V6H9zm10 4h-2V4h-2v4h-2v7h2v5h2v-5h2z"})
                                        "CandlestickChart"))

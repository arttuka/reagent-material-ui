(ns reagent-mui.icons.candlestick-chart-outlined
  "Imports @mui/icons-material/CandlestickChartOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def candlestick-chart-outlined (create-svg-icon (e "path" #js {"d" "M9 4H7v2H5v12h2v2h2v-2h2V6H9V4zm0 12H7V8h2v8zm10-8h-2V4h-2v4h-2v7h2v5h2v-5h2V8zm-2 5h-2v-3h2v3z"})
                                                 "CandlestickChartOutlined"))

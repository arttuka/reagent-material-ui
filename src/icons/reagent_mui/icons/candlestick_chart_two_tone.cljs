(ns reagent-mui.icons.candlestick-chart-two-tone
  "Imports @mui/icons-material/CandlestickChartTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def candlestick-chart-two-tone (create-svg-icon [(e "path" #js {"d" "M9 4H7v2H5v12h2v2h2v-2h2V6H9V4zm0 12H7V8h2v8z"}) (e "path" #js {"d" "M7 8h2v8H7zm8 2h2v3h-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 8h-2V4h-2v4h-2v7h2v5h2v-5h2V8zm-2 5h-2v-3h2v3z"})]
                                                 "CandlestickChartTwoTone"))

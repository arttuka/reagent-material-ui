(ns reagent-mui.icons.live-tv-two-tone
  "Imports @mui/icons-material/LiveTvTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def live-tv-two-tone (create-svg-icon [(e "path" #js {"d" "M3 20h18V8H3v12zm6-10 7 4-7 4v-8z", "opacity" ".3"}) (e "path" #js {"d" "M9 10v8l7-4zm12-4h-7.58l3.29-3.29L16 2l-4 4h-.03l-4-4-.69.71L10.56 6H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 14H3V8h18v12z"})]
                                       "LiveTvTwoTone"))

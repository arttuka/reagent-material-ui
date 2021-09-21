(ns reagent-mui.icons.today-two-tone
  "Imports @mui/icons-material/TodayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def today-two-tone (create-svg-icon [(e "path" #js {"d" "M19 3h-1V1h-2v2H8V1H6v2H5c-1.11 0-1.99.9-1.99 2L3 19c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V9h14v10zm0-12H5V5h14v2zm-7 4H7v5h5v-5z"}) (e "path" #js {"d" "M5 5h14v2H5z", "opacity" ".3"})]
                                     "TodayTwoTone"))

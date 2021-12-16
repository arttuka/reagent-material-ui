(ns reagent-mui.icons.monitor-heart-sharp
  "Imports @mui/icons-material/MonitorHeartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def monitor-heart-sharp (create-svg-icon [(e "path" #js {"d" "M15.11 12.45 14 10.24l-3.11 6.21c-.16.34-.51.55-.89.55s-.73-.21-.89-.55L7.38 13H2v7h20v-7h-6c-.38 0-.73-.21-.89-.55z"}) (e "path" #js {"d" "M22 4H2v7h6c.38 0 .73.21.89.55L10 13.76l3.11-6.21c.37-.74 1.42-.74 1.79 0L16.62 11H22V4z"})]
                                          "MonitorHeartSharp"))

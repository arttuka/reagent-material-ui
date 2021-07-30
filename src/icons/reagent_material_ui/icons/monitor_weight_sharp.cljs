(ns reagent-material-ui.icons.monitor-weight-sharp
  "Imports @material-ui/icons/MonitorWeightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def monitor-weight-sharp (create-svg-icon [(e "path" #js {"d" "M21 3H3v18h18V3zm-6.8 8.2c-3.23 2.43-6.84-1.18-4.4-4.41 3.23-2.42 6.83 1.19 4.4 4.41z"}) (e "path" #js {"d" "M10 8.5h1v1h-1zm1.5 0h1v1h-1zm1.5 0h1v1h-1z"})]
                                           "MonitorWeightSharp"))

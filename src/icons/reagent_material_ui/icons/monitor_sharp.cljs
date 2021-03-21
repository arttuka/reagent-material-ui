(ns reagent-material-ui.icons.monitor-sharp
  "Imports @material-ui/icons/MonitorSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def monitor-sharp (create-svg-icon (e "path" #js {"d" "M22 3H2v15h5l-1 1v2h12v-2l-1-1h5V3zm-2 13H4V5h16v11z"})
                                    "MonitorSharp"))

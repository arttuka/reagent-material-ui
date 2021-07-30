(ns reagent-material-ui.icons.monitor-two-tone
  "Imports @material-ui/icons/MonitorTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def monitor-two-tone (create-svg-icon [(e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h3l-1 1v2h12v-2l-1-1h3c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 13H4V5h16v11z"}) (e "path" #js {"d" "M4 5h16v11H4z", "opacity" ".3"})]
                                       "MonitorTwoTone"))

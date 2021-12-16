(ns reagent-mui.icons.punch-clock
  "Imports @mui/icons-material/PunchClock as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def punch-clock (create-svg-icon [(e "path" #js {"d" "M19 6h-1V1H6v5H5c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zM8 3h8v3H8V3zm4 16c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}) (e "path" #js {"d" "M12.5 11.5h-1v2.71l1.64 1.64.71-.71-1.35-1.35z"})]
                                  "PunchClock"))

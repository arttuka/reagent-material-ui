(ns reagent-mui.icons.airline-seat-flat-rounded
  "Imports @mui/icons-material/AirlineSeatFlatRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-flat-rounded (create-svg-icon (e "path" #js {"d" "M22 11v2H9V9c0-1.1.9-2 2-2h7c2.21 0 4 1.79 4 4zM2 15c0 .55.45 1 1 1h5v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h5c.55 0 1-.45 1-1s-.45-1-1-1H3c-.55 0-1 .45-1 1zm5.14-2.9c1.16-1.19 1.14-3.08-.04-4.24-1.19-1.16-3.08-1.14-4.24.04-1.16 1.19-1.14 3.08.04 4.24 1.19 1.16 3.08 1.14 4.24-.04z"})
                                                "AirlineSeatFlatRounded"))

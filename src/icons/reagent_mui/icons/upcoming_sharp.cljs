(ns reagent-mui.icons.upcoming-sharp
  "Imports @mui/icons-material/UpcomingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upcoming-sharp (create-svg-icon (e "path" #js {"d" "m21.16 7.26-1.41-1.41-3.56 3.55 1.41 1.41s3.45-3.52 3.56-3.55zM11 3h2v5h-2zm-4.6 7.81L7.81 9.4 4.26 5.84 2.84 7.26c.11.03 3.56 3.55 3.56 3.55zM22 12h-7c0 1.66-1.34 3-3 3s-3-1.34-3-3H2v9h20v-9z"})
                                     "UpcomingSharp"))

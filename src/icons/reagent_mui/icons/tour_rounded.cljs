(ns reagent-mui.icons.tour-rounded
  "Imports @mui/icons-material/TourRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tour-rounded (create-svg-icon (e "path" #js {"d" "M20.45 5.37c.26-.66-.22-1.37-.93-1.37H7V3c0-.55-.45-1-1-1s-1 .45-1 1v19h2v-8h12.52c.71 0 1.19-.71.93-1.37L19 9l1.45-3.63zM15 9c0 1.1-.9 2-2 2s-2-.9-2-2 .9-2 2-2 2 .9 2 2z"})
                                   "TourRounded"))

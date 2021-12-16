(ns reagent-mui.icons.view-timeline-sharp
  "Imports @mui/icons-material/ViewTimelineSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-timeline-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-9 14H6v-2h6v2zm3-4H9v-2h6v2zm3-4h-6V7h6v2z"})
                                          "ViewTimelineSharp"))

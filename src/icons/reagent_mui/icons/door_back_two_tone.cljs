(ns reagent-mui.icons.door-back-two-tone
  "Imports @mui/icons-material/DoorBackTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def door-back-two-tone (create-svg-icon [(e "path" #js {"d" "M7 19h10V5H7v14zm2-8h2v2H9v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 19V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14H3v2h18v-2h-2zm-2 0H7V5h10v14z"}) (e "path" #js {"d" "M9 11h2v2H9z"})]
                                         "DoorBackTwoTone"))

(ns reagent-mui.icons.smart-display-two-tone
  "Imports @mui/icons-material/SmartDisplayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smart-display-two-tone (create-svg-icon [(e "path" #js {"d" "M4 18.01h16V5.99H4v12.02zM9.5 7.5l7 4.5-7 4.5v-9z", "opacity" ".3"}) (e "path" #js {"d" "M9.5 7.5v9l7-4.5z"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14.01H4V5.99h16v12.02z"})]
                                             "SmartDisplayTwoTone"))

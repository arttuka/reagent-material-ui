(ns reagent-mui.icons.curtains-closed-two-tone
  "Imports @mui/icons-material/CurtainsClosedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def curtains-closed-two-tone (create-svg-icon [(e "path" #js {"d" "M6 5h3v14H6zm9 0h3v14h-3z", "opacity" ".3"}) (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM9 19H6V5h3v14zm4 0h-2V5h2v14zm5 0h-3V5h3v14z"})]
                                               "CurtainsClosedTwoTone"))

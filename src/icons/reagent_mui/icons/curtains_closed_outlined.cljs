(ns reagent-mui.icons.curtains-closed-outlined
  "Imports @mui/icons-material/CurtainsClosedOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def curtains-closed-outlined (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM13 5v14h-2V5h2zM6 5h3v14H6V5zm9 14V5h3v14h-3z"})
                                               "CurtainsClosedOutlined"))

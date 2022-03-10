(ns reagent-mui.icons.vertical-shades-outlined
  "Imports @mui/icons-material/VerticalShadesOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades-outlined (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM14 5v14h-4V5h4zM6 5h2v14H6V5zm10 14V5h2v14h-2z"})
                                               "VerticalShadesOutlined"))

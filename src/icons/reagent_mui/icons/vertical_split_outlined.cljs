(ns reagent-mui.icons.vertical-split-outlined
  "Imports @mui/icons-material/VerticalSplitOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-split-outlined (create-svg-icon (e "path" #js {"d" "M3 13h8v2H3zm0 4h8v2H3zm0-8h8v2H3zm0-4h8v2H3zm16 2v10h-4V7h4m2-2h-8v14h8V5z"})
                                              "VerticalSplitOutlined"))

(ns reagent-mui.icons.view-compact-outlined
  "Imports @mui/icons-material/ViewCompactOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-compact-outlined (create-svg-icon (e "path" #js {"d" "M3 5v14h19V5H3zm2 2h15v4H5V7zm0 10v-4h4v4H5zm6 0v-4h9v4h-9z"})
                                            "ViewCompactOutlined"))

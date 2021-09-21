(ns reagent-mui.icons.drag-handle-outlined
  "Imports @mui/icons-material/DragHandleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drag-handle-outlined (create-svg-icon (e "path" #js {"d" "M20 9H4v2h16V9zM4 15h16v-2H4v2z"})
                                           "DragHandleOutlined"))

(ns reagent-mui.icons.edit-road
  "Imports @mui/icons-material/EditRoad as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edit-road (create-svg-icon (e "path" #js {"d" "M18 4h-2v7.9l2-2zM4 4h2v16H4zm6 0h2v4h-2zm0 6h2v4h-2zm0 6h2v4h-2zm12.56-3.41-1.15-1.15c-.59-.59-1.54-.59-2.12 0L14 16.73V20h3.27l5.29-5.29c.59-.59.59-1.54 0-2.12zm-5.98 5.86h-1.03v-1.03L19 13.97 20.03 15l-3.45 3.45z"})
                                "EditRoad"))

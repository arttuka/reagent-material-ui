(ns reagent-mui.icons.space-bar-outlined
  "Imports @mui/icons-material/SpaceBarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def space-bar-outlined (create-svg-icon (e "path" #js {"d" "M18 9v4H6V9H4v6h16V9h-2z"})
                                         "SpaceBarOutlined"))

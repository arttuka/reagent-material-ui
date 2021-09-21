(ns reagent-mui.icons.sort-outlined
  "Imports @mui/icons-material/SortOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sort-outlined (create-svg-icon (e "path" #js {"d" "M3 18h6v-2H3v2zM3 6v2h18V6H3zm0 7h12v-2H3v2z"})
                                    "SortOutlined"))

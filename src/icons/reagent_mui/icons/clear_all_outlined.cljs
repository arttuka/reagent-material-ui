(ns reagent-mui.icons.clear-all-outlined
  "Imports @mui/icons-material/ClearAllOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def clear-all-outlined (create-svg-icon (e "path" #js {"d" "M5 13h14v-2H5v2zm-2 4h14v-2H3v2zM7 7v2h14V7H7z"})
                                         "ClearAllOutlined"))

(ns reagent-mui.icons.add-outlined
  "Imports @mui/icons-material/AddOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-outlined (create-svg-icon (e "path" #js {"d" "M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"})
                                   "AddOutlined"))

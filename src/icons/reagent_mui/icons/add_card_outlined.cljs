(ns reagent-mui.icons.add-card-outlined
  "Imports @mui/icons-material/AddCardOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-card-outlined (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h10v-2H4v-6h18V6c0-1.11-.89-2-2-2zm0 4H4V6h16v2zm4 9v2h-3v3h-2v-3h-3v-2h3v-3h2v3h3z"})
                                        "AddCardOutlined"))

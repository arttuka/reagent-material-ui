(ns reagent-mui.icons.outlined-flag-outlined
  "Imports @mui/icons-material/OutlinedFlagOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def outlined-flag-outlined (create-svg-icon (e "path" #js {"d" "m14 6-1-2H5v17h2v-7h5l1 2h7V6h-6zm4 8h-4l-1-2H7V6h5l1 2h5v6z"})
                                             "OutlinedFlagOutlined"))

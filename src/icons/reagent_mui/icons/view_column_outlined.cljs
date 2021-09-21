(ns reagent-mui.icons.view-column-outlined
  "Imports @mui/icons-material/ViewColumnOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-column-outlined (create-svg-icon (e "path" #js {"d" "M3 5v14h18V5H3zm5.33 12H5V7h3.33v10zm5.34 0h-3.33V7h3.33v10zM19 17h-3.33V7H19v10z"})
                                           "ViewColumnOutlined"))

(ns reagent-mui.icons.forward-outlined
  "Imports @mui/icons-material/ForwardOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def forward-outlined (create-svg-icon (e "path" #js {"d" "M14 8.83 17.17 12 14 15.17V14H6v-4h8V8.83M12 4v4H4v8h8v4l8-8-8-8z"})
                                       "ForwardOutlined"))

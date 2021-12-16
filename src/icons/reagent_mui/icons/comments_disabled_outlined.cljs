(ns reagent-mui.icons.comments-disabled-outlined
  "Imports @mui/icons-material/CommentsDisabledOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def comments-disabled-outlined (create-svg-icon (e "path" #js {"d" "M18.83 16H20V4H6.83l-2-2H20c1.1 0 2 .9 2 2v15.17L18.83 16zM18 6H8.83l2 2H18V6zm0 3h-6.17l2 2H18V9zm0 5v-2h-3.17l2 2H18zm3.9 7.9-1.41 1.41L15.17 18H4c-1.1 0-2-.9-2-2V4.83L.69 3.51 2.1 2.1l19.8 19.8zM13.17 16l-2-2H6v-2h3.17l-1-1H6V9h.17L4 6.83V16h9.17z"})
                                                 "CommentsDisabledOutlined"))

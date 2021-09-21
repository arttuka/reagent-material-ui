(ns reagent-mui.icons.mark-as-unread-sharp
  "Imports @mui/icons-material/MarkAsUnreadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mark-as-unread-sharp (create-svg-icon [(e "path" #js {"d" "M16.23 7h4.12L10.5 2 2 6.21V17h2V7.4L10.5 4z"}) (e "path" #js {"d" "M5 8v13h17V8H5zm15 4-6.5 3.33L7 12v-2l6.5 3.33L20 10v2z"})]
                                           "MarkAsUnreadSharp"))

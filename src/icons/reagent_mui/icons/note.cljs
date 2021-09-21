(ns reagent-mui.icons.note
  "Imports @mui/icons-material/Note as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note (create-svg-icon (e "path" #js {"d" "m22 10-6-6H4c-1.1 0-2 .9-2 2v12.01c0 1.1.9 1.99 2 1.99l16-.01c1.1 0 2-.89 2-1.99v-8zm-7-4.5 5.5 5.5H15V5.5z"})
                           "Note"))

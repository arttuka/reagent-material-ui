(ns reagent-mui.icons.insert-page-break
  "Imports @mui/icons-material/InsertPageBreak as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-page-break (create-svg-icon (e "path" #js {"d" "M4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2v-3H4v3zM20 8l-6-6H6c-1.1 0-1.99.9-1.99 2v7H20V8zm-7 1V3.5L18.5 9H13zm-4 4h6v2H9zm8 0h6v2h-6zM1 13h6v2H1z"})
                                        "InsertPageBreak"))

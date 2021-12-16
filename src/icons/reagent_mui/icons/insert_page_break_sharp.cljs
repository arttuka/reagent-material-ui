(ns reagent-mui.icons.insert-page-break-sharp
  "Imports @mui/icons-material/InsertPageBreakSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-page-break-sharp (create-svg-icon (e "path" #js {"d" "M4 17h16v5H4zm16-9-6-6H4.01L4 11h16V8zm-7 1V3.5L18.5 9H13zm-4 4h6v2H9zm8 0h6v2h-6zM1 13h6v2H1z"})
                                              "InsertPageBreakSharp"))

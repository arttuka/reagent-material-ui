(ns reagent-mui.icons.severe-cold-outlined
  "Imports @mui/icons-material/SevereColdOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def severe-cold-outlined (create-svg-icon (e "path" #js {"d" "m12 10.41 4-4L14.59 5 12 7.59V4h-2v3.59L7.41 5 6 6.41l4 4V12H8.41l-4-4L3 9.41 5.59 12H2v2h3.59L3 16.59 4.41 18l4-4H10v1.59l-4 4L7.41 21 10 18.41V22h2v-3.59L14.59 21 16 19.59l-4-4V14h1.59l4 4L19 16.59 16.41 14H20v-2h-8zM19 2h2v5h-2zm0 6h2v2h-2z"})
                                           "SevereColdOutlined"))

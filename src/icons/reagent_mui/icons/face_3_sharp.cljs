(ns reagent-mui.icons.face-3-sharp
  "Imports @mui/icons-material/Face3Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def face-3-sharp (create-svg-icon [(e "circle" #js {"cx" "9", "cy" "13", "r" "1.25"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1.25"}) (e "path" #js {"d" "M22.91 11.96c-.54-5.93-5.75-10.41-11.8-9.92-5.38.42-9.56 4.9-10.05 10.28L0 24h24l-1.09-12.04zM4.54 9.13c.87.55 1.89.87 2.96.87 1.86 0 3.5-.93 4.5-2.35C13 9.07 14.64 10 16.5 10c1.07 0 2.09-.32 2.96-.87.34.89.54 1.86.54 2.87 0 4.41-3.59 8-8 8s-8-3.59-8-8c0-1.01.2-1.98.54-2.87z"})]
                                   "Face3Sharp"))

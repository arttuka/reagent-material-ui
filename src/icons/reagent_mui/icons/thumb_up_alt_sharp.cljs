(ns reagent-mui.icons.thumb-up-alt-sharp
  "Imports @mui/icons-material/ThumbUpAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thumb-up-alt-sharp (create-svg-icon (e "path" #js {"d" "M14.17 1 7 8.18V21h12.31L23 12.4V8h-8.31l1.12-5.38zM1 9h4v12H1z"})
                                         "ThumbUpAltSharp"))

(ns reagent-mui.icons.border-color-sharp
  "Imports @mui/icons-material/BorderColorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def border-color-sharp (create-svg-icon (e "path" #js {"d" "M22 24H2v-4h20v4zM13.06 5.19l3.75 3.75L7.75 18H4v-3.75l9.06-9.06zm4.82 2.68-3.75-3.75 2.53-2.54 3.75 3.75-2.53 2.54z"})
                                         "BorderColorSharp"))

(ns reagent-mui.icons.one-kk-sharp
  "Imports @mui/icons-material/OneKkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def one-kk-sharp (create-svg-icon (e "path" #js {"d" "M10 10.5h1.5v3H10v-3zM21 3H3v18h18V3zM7.5 15H6v-4.5H4.5V9h3v6zM13 9v6H8.5V9H13zm6 6h-1.75l-1.75-2.25V15H14V9h1.5v2.25L17.25 9H19l-2.25 3L19 15z"})
                                   "OneKkSharp"))

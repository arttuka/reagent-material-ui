(ns reagent-mui.icons.chevron-right-sharp
  "Imports @mui/icons-material/ChevronRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def chevron-right-sharp (create-svg-icon (e "path" #js {"d" "M10 6 8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6-6-6z"})
                                          "ChevronRightSharp"))

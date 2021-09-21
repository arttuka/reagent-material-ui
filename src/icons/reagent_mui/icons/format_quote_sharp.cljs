(ns reagent-mui.icons.format-quote-sharp
  "Imports @mui/icons-material/FormatQuoteSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-quote-sharp (create-svg-icon (e "path" #js {"d" "M5 17h3l2-4V7H4v6h3l-2 4zm10 0h3l2-4V7h-6v6h3l-2 4z"})
                                         "FormatQuoteSharp"))

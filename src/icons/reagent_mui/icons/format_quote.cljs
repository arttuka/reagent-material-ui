(ns reagent-mui.icons.format-quote
  "Imports @mui/icons-material/FormatQuote as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-quote (create-svg-icon (e "path" #js {"d" "M6 17h3l2-4V7H5v6h3zm8 0h3l2-4V7h-6v6h3z"})
                                   "FormatQuote"))

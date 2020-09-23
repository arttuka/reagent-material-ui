(ns reagent-material-ui.icons.format-quote
  "Imports @material-ui/icons/FormatQuote as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-quote (create-svg-icon (e "path" #js {"d" "M6 17h3l2-4V7H5v6h3zm8 0h3l2-4V7h-6v6h3z"})
                                   "FormatQuote"))

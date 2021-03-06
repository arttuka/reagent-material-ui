(ns reagent-material-ui.icons.format-quote-rounded
  "Imports @material-ui/icons/FormatQuoteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-quote-rounded (create-svg-icon (e "path" #js {"d" "M8.17 17c.51 0 .98-.29 1.2-.74l1.42-2.84c.14-.28.21-.58.21-.89V8c0-1.1-.9-2-2-2H5.34C4.6 6 4 6.6 4 7.34v4.32C4 12.4 4.6 13 5.34 13H8l-1.03 2.06c-.45.89.2 1.94 1.2 1.94zm9 0c.51 0 .98-.29 1.2-.74l1.42-2.84c.14-.28.21-.58.21-.89V7.34C20 6.6 19.4 6 18.66 6h-4.32C13.6 6 13 6.6 13 7.34v4.32c0 .74.6 1.34 1.34 1.34H17l-1.03 2.06c-.45.89.2 1.94 1.2 1.94z"})
                                           "FormatQuoteRounded"))

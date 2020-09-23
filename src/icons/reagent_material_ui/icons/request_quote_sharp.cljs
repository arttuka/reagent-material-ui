(ns reagent-material-ui.icons.request-quote-sharp
  "Imports @material-ui/icons/RequestQuoteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def request-quote-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm1 10h-4v1h4v5h-2v1h-2v-1H9v-2h4v-1H9v-5h2V9h2v1h2v2zm-2-4V3.5L17.5 8H13z"})
                                          "RequestQuoteSharp"))

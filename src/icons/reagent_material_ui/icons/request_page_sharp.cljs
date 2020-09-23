(ns reagent-material-ui.icons.request-page-sharp
  "Imports @material-ui/icons/RequestPageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def request-page-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4.01L4 22h16V8l-6-6zm1 9h-4v1h4v5h-2v1h-2v-1H9v-2h4v-1H9V9h2V8h2v1h2v2z"})
                                         "RequestPageSharp"))

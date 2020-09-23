(ns reagent-material-ui.icons.transit-enterexit-two-tone
  "Imports @material-ui/icons/TransitEnterexitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def transit-enterexit-two-tone (create-svg-icon (e "path" #js {"d" "M15.98 6L9 12.77V8H6v10h10v-3h-4.85L18 8.03z"})
                                                 "TransitEnterexitTwoTone"))

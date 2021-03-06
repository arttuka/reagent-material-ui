(ns reagent-material-ui.icons.outbox-sharp
  "Imports @material-ui/icons/OutboxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def outbox-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 14h2v-3h3l-4-4-4 4h3z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm16 11h-4.18c-.41 1.16-1.51 2-2.82 2s-2.4-.84-2.82-2H5V5h14v9z"}))
                                   "OutboxSharp"))

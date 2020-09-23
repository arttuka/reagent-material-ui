(ns reagent-material-ui.icons.home-repair-service
  "Imports @material-ui/icons/HomeRepairService as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def home-repair-service (create-svg-icon (e "path" #js {"d" "M18 16h-2v-1H8v1H6v-1H2v5h20v-5h-4zM20 8h-3V6c0-1.1-.9-2-2-2H9c-1.1 0-2 .9-2 2v2H4c-1.1 0-2 .9-2 2v4h4v-2h2v2h8v-2h2v2h4v-4c0-1.1-.9-2-2-2zm-5 0H9V6h6v2z"})
                                          "HomeRepairService"))

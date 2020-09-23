(ns reagent-material-ui.icons.home-repair-service-sharp
  "Imports @material-ui/icons/HomeRepairServiceSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def home-repair-service-sharp (create-svg-icon (e "path" #js {"d" "M18 16h-2v-1H8v1H6v-1H2v5h20v-5h-4zM17 8V4H7v4H2v6h4v-2h2v2h8v-2h2v2h4V8h-5zM9 6h6v2H9V6z"})
                                                "HomeRepairServiceSharp"))

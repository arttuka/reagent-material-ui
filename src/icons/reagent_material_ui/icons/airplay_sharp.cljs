(ns reagent-material-ui.icons.airplay-sharp
  "Imports @material-ui/icons/AirplaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def airplay-sharp (create-svg-icon (e "path" #js {"d" "M6 22h12l-6-6-6 6zM23 3H1v16h6v-2H3V5h18v12h-4v2h6V3z"})
                                    "AirplaySharp"))

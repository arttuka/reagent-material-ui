(ns reagent-material-ui.icons.airplay-two-tone
  "Imports @material-ui/icons/AirplayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def airplay-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 22h12l-6-6z"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h4v-2H3V5h18v12h-4v2h4c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"}))
                                       "AirplayTwoTone"))

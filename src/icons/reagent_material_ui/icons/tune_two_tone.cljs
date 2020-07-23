(ns reagent-material-ui.icons.tune-two-tone
  "Imports @material-ui/icons/TuneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def tune-two-tone (create-svg-icon (e "path" #js {"d" "M3 5h10v2H3zm4 6H3v2h4v2h2V9H7zm6 4h-2v6h2v-2h8v-2h-8zM3 17h6v2H3zm8-6h10v2H11zm6-8h-2v6h2V7h4V5h-4z"})
                                    "TuneTwoTone"))

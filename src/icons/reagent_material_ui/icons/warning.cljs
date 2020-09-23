(ns reagent-material-ui.icons.warning
  "Imports @material-ui/icons/Warning as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def warning (create-svg-icon (e "path" #js {"d" "M1 21h22L12 2 1 21zm12-3h-2v-2h2v2zm0-4h-2v-4h2v4z"})
                              "Warning"))

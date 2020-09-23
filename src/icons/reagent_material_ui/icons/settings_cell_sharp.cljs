(ns reagent-material-ui.icons.settings-cell-sharp
  "Imports @material-ui/icons/SettingsCellSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def settings-cell-sharp (create-svg-icon (e "path" #js {"d" "M7 24h2v-2H7v2zm4 0h2v-2h-2v2zm4 0h2v-2h-2v2zM6 0v20h12V0H6zm10 16H8V4h8v12z"})
                                          "SettingsCellSharp"))

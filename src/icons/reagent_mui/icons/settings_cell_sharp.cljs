(ns reagent-mui.icons.settings-cell-sharp
  "Imports @mui/icons-material/SettingsCellSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def settings-cell-sharp (create-svg-icon (e "path" #js {"d" "M7 24h2v-2H7v2zm4 0h2v-2h-2v2zm4 0h2v-2h-2v2zM6 0v20h12V0H6zm10 16H8V4h8v12z"})
                                          "SettingsCellSharp"))

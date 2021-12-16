(ns reagent-mui.icons.terminal-sharp
  "Imports @mui/icons-material/TerminalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def terminal-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm18 14H4V8h16v10zm-2-1h-6v-2h6v2zM7.5 17l-1.41-1.41L8.67 13l-2.59-2.59L7.5 9l4 4-4 4z"})
                                     "TerminalSharp"))

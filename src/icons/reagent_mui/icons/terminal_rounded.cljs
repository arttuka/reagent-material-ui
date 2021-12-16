(ns reagent-mui.icons.terminal-rounded
  "Imports @mui/icons-material/TerminalRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def terminal-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H4V8h16v10zm-8-2c0-.55.45-1 1-1h4c.55 0 1 .45 1 1s-.45 1-1 1h-4c-.55 0-1-.45-1-1zM6.79 9.71c.39-.39 1.02-.39 1.41 0l2.59 2.59c.39.39.39 1.02 0 1.41L8.2 16.3c-.39.39-1.02.39-1.41 0a.9959.9959 0 0 1 0-1.41L8.67 13l-1.88-1.88a.9959.9959 0 0 1 0-1.41z"})
                                       "TerminalRounded"))

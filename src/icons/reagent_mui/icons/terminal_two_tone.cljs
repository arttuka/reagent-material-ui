(ns reagent-mui.icons.terminal-two-tone
  "Imports @mui/icons-material/TerminalTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def terminal-two-tone (create-svg-icon [(e "path" #js {"d" "M4 18h16V8H4v10zm8-3h6v2h-6v-2zm-5.91-4.59L7.5 9l4 4-4 4-1.41-1.41L8.67 13l-2.58-2.59z", "opacity" ".3"}) (e "path" #js {"d" "M12 15h6v2h-6z"}) (e "path" #js {"d" "M20 4H4c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H4V8h16v10z"}) (e "path" #js {"d" "m7.5 17 4-4-4-4-1.41 1.41L8.67 13l-2.58 2.59z"})]
                                        "TerminalTwoTone"))

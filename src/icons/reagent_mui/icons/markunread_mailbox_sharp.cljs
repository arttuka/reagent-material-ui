(ns reagent-mui.icons.markunread-mailbox-sharp
  "Imports @mui/icons-material/MarkunreadMailboxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def markunread-mailbox-sharp (create-svg-icon (e "path" #js {"d" "M22 6H10v6H8V4h6V0H6v6H2v16h20V6z"})
                                               "MarkunreadMailboxSharp"))

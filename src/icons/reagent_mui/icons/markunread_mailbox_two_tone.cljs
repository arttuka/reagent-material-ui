(ns reagent-mui.icons.markunread-mailbox-two-tone
  "Imports @mui/icons-material/MarkunreadMailboxTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def markunread-mailbox-two-tone (create-svg-icon [(e "path" #js {"d" "M10 12H6V8H4v12h16V8H10z", "opacity" ".3"}) (e "path" #js {"d" "M20 6H10v2h10v12H4V8h2v4h2V4h6V0H6v6H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2z"})]
                                                  "MarkunreadMailboxTwoTone"))

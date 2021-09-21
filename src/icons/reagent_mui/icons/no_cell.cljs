(ns reagent-mui.icons.no-cell
  "Imports @mui/icons-material/NoCell as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def no-cell (create-svg-icon (e "path" #js {"d" "m8.83 6-3.7-3.7C5.42 1.55 6.15 1 7 1l10 .01c1.1 0 2 .89 2 1.99v13.17l-2-2V6H8.83zm10.95 16.61-.91-.91c-.29.75-1.02 1.3-1.87 1.3H7c-1.1 0-2-.9-2-2V7.83L1.39 4.22 2.8 2.81l18.38 18.38-1.4 1.42zM15.17 18 7 9.83V18h8.17z"})
                              "NoCell"))

(ns reagent-mui.icons.print-disabled-rounded
  "Imports @mui/icons-material/PrintDisabledRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def print-disabled-rounded (create-svg-icon (e "path" #js {"d" "M2.12 2.32a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L4.98 8C3.33 8.01 2 9.35 2 11v4c0 1.1.9 2 2 2h2v2c0 1.1.9 2 2 2h8c.55 0 1.04-.22 1.4-.58l2.83 2.83c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L2.12 2.32zM15 19H9c-.55 0-1-.45-1-1v-4h2.98l4.72 4.72c-.19.17-.43.28-.7.28zm4-11h-8.37l9 9H20c1.1 0 2-.9 2-2v-4c0-1.66-1.34-3-3-3zm0 4c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm-2-5c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1H7c-.37 0-.68.21-.85.51L9.63 7H17z"})
                                             "PrintDisabledRounded"))

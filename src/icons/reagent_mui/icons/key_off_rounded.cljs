(ns reagent-mui.icons.key-off-rounded
  "Imports @mui/icons-material/KeyOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def key-off-rounded (create-svg-icon (e "path" #js {"d" "m12.83 10 4.09 4.09L17 14l1.29 1.29c.39.39 1.03.39 1.42 0l2.59-2.61c.39-.39.39-1.03-.01-1.42l-.99-.97c-.2-.19-.45-.29-.71-.29h-7.76zm6.24 11.9c.39.39 1.02.39 1.41 0s.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L3.98 6.8C2.2 7.85 1 9.79 1 12c0 3.31 2.69 6 6 6 2.21 0 4.15-1.2 5.18-2.99l6.89 6.89zm-9.16-9.16C9.58 14.03 8.4 15 7 15c-1.65 0-3-1.35-3-3 0-1.4.97-2.58 2.26-2.91l3.65 3.65z"})
                                      "KeyOffRounded"))

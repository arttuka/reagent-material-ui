(ns reagent-mui.icons.desktop-access-disabled-sharp
  "Imports @mui/icons-material/DesktopAccessDisabledSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desktop-access-disabled-sharp (create-svg-icon (e "path" #js {"d" "M1.41 1.69 0 3.1l1 .99V18h9v2H8v2h8v-2h-2v-2h.9l6 6 1.41-1.41-20.9-20.9zM2.99 16V6.09L12.9 16H2.99zM4.55 2l2 2H21v12h-2.45l2 2h2.44V2z"})
                                                    "DesktopAccessDisabledSharp"))

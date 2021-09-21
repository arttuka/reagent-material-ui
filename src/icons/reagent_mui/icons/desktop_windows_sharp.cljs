(ns reagent-mui.icons.desktop-windows-sharp
  "Imports @mui/icons-material/DesktopWindowsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desktop-windows-sharp (create-svg-icon (e "path" #js {"d" "M23 2H1v16h9v2H8v2h8v-2h-2v-2h9V2zm-2 14H3V4h18v12z"})
                                            "DesktopWindowsSharp"))

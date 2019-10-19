(ns reagent-material-ui.icons.desktop-windows-sharp
  "Imports @material-ui/icons/DesktopWindowsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def desktop-windows-sharp (create-svg-icon (e "path" #js {"d" "M23 2H1v16h9v2H8v2h8v-2h-2v-2h9V2zm-2 14H3V4h18v12z"})
                                            "DesktopWindowsSharp"))

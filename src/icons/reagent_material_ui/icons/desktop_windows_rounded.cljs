(ns reagent-material-ui.icons.desktop-windows-rounded
  "Imports @material-ui/icons/DesktopWindowsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def desktop-windows-rounded (create-svg-icon (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h6v2H9c-.55 0-1 .45-1 1s.45 1 1 1h6c.55 0 1-.45 1-1s-.45-1-1-1h-1v-2h6c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 13H4V5h16v11z"})
                                              "DesktopWindowsRounded"))

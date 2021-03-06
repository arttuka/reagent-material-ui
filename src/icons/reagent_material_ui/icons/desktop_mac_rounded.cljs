(ns reagent-material-ui.icons.desktop-mac-rounded
  "Imports @material-ui/icons/DesktopMacRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def desktop-mac-rounded (create-svg-icon (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h6l-1.29 1.29c-.63.63-.19 1.71.7 1.71h5.17c.89 0 1.34-1.08.71-1.71L14 19h6c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 11H4V5h16v9z"})
                                          "DesktopMacRounded"))

(ns reagent-material-ui.icons.desktop-mac-sharp
  "Imports @material-ui/icons/DesktopMacSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def desktop-mac-sharp (create-svg-icon (e "path" #js {"d" "M23 2H1v16h9l-2 3v1h8v-1l-2-3h9V2zm-2 12H3V4h18v10z"})
                                        "DesktopMacSharp"))

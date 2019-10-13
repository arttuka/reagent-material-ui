(ns reagent-material-ui.icons.tablet-mac-sharp
  "Imports @material-ui/icons/TabletMacSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def tablet-mac-sharp (create-svg-icon (e "path" #js {"d" "M21 0H2v24h19V0zm-9.5 23c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zm7.5-4H4V3h15v16z"})
                                       "TabletMacSharp"))

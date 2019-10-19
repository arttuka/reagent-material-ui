(ns reagent-material-ui.icons.live-tv-sharp
  "Imports @material-ui/icons/LiveTvSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def live-tv-sharp (create-svg-icon (e "path" #js {"d" "M23 6h-9.59l3.29-3.29L16 2l-4 4-4-4-.71.71L10.59 6H1v16h22V6zm-2 14H3V8h18v12zM9 10v8l7-4-7-4z"})
                                    "LiveTvSharp"))

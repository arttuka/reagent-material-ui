(ns reagent-material-ui.icons.stop-circle-sharp
  "Imports @material-ui/icons/StopCircleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop-circle-sharp (create-svg-icon (e "path" #js {"d" "M8 16h8V8H8v8zm4-14C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2z", "fillRule" "evenodd"})
                                        "StopCircleSharp"))

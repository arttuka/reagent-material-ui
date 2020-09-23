(ns reagent-material-ui.icons.stop-rounded
  "Imports @material-ui/icons/StopRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop-rounded (create-svg-icon (e "path" #js {"d" "M8 6h8c1.1 0 2 .9 2 2v8c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2V8c0-1.1.9-2 2-2z"})
                                   "StopRounded"))

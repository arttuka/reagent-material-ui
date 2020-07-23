(ns reagent-material-ui.icons.system-update-sharp
  "Imports @material-ui/icons/SystemUpdateSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-update-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 18H7V5h10v14zm-1-6h-3V8h-2v5H8l4 4 4-4z"})
                                          "SystemUpdateSharp"))

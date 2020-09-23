(ns reagent-material-ui.icons.browser-not-supported-sharp
  "Imports @material-ui/icons/BrowserNotSupportedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def browser-not-supported-sharp (create-svg-icon (e "path" #js {"d" "M19 6v10.5l2 2V4H6.5l2 2zM3.22 3.32L1.95 4.59 3 5.64V20h14.36l2.06 2.06 1.27-1.27L3.22 3.32zM15 18H5V7.64L15.36 18H15z"})
                                                  "BrowserNotSupportedSharp"))

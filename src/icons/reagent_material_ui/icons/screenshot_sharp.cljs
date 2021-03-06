(ns reagent-material-ui.icons.screenshot-sharp
  "Imports @material-ui/icons/ScreenshotSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def screenshot-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 17H7V6h10v12zM9.5 8.5H12V7H8v4h1.5V8.5zM12 17h4v-4h-1.5v2.5H12V17z"})
                                       "ScreenshotSharp"))

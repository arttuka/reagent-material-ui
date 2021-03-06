(ns reagent-material-ui.icons.window-sharp
  "Imports @material-ui/icons/WindowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def window-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20h20V2zm-2 9h-7V4h7v7zm-9-7v7H4V4h7zm-7 9h7v7H4v-7zm9 7v-7h7v7h-7z"})
                                   "WindowSharp"))

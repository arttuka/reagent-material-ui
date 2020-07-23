(ns reagent-material-ui.icons.web-sharp
  "Imports @material-ui/icons/WebSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def web-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 9h10.5v3.5H4V9zm0 5.5h10.5V18H4v-3.5zM20 18h-3.5V9H20v9z"})
                                "WebSharp"))

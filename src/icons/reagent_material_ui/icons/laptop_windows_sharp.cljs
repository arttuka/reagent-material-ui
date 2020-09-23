(ns reagent-material-ui.icons.laptop-windows-sharp
  "Imports @material-ui/icons/LaptopWindowsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def laptop-windows-sharp (create-svg-icon (e "path" #js {"d" "M20 18v-1h1.99L22 3H2v14h2v1H0v2h24v-2h-4zM4 5h16v10H4V5z"})
                                           "LaptopWindowsSharp"))

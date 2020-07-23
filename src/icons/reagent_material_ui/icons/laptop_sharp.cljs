(ns reagent-material-ui.icons.laptop-sharp
  "Imports @material-ui/icons/LaptopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def laptop-sharp (create-svg-icon (e "path" #js {"d" "M20 18l2-2V4H2v12l2 2H0v2h24v-2h-4zM4 6h16v10H4V6z"})
                                   "LaptopSharp"))

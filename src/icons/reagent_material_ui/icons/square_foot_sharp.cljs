(ns reagent-material-ui.icons.square-foot-sharp
  "Imports @material-ui/icons/SquareFootSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def square-foot-sharp (create-svg-icon (e "path" #js {"d" "M17.66 17.66l-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06L9.7 9.7l-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06L4 4v16h16l-2.34-2.34zM7 17v-5.76L12.76 17H7z"})
                                        "SquareFootSharp"))

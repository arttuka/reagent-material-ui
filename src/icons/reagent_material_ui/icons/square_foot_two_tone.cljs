(ns reagent-material-ui.icons.square-foot-two-tone
  "Imports @material-ui/icons/SquareFootTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def square-foot-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17h5.76L7 11.24z", "opacity" ".3"}) (e "path" #js {"d" "M17.66 17.66l-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06L9.7 9.7l-1.06 1.06-.71-.71 1.06-1.06-1.94-1.94-1.06 1.06-.71-.71 1.06-1.06L4 4v14c0 1.1.9 2 2 2h14l-2.34-2.34zM7 17v-5.76L12.76 17H7z"}))
                                           "SquareFootTwoTone"))

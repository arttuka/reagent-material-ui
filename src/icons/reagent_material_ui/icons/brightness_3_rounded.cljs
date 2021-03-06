(ns reagent-material-ui.icons.brightness-3-rounded
  "Imports @material-ui/icons/Brightness3Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def brightness-3-rounded (create-svg-icon (e "path" #js {"d" "M8.93 2h-.14c-.83.02-1.09 1.12-.39 1.56 2.78 1.77 4.63 4.89 4.63 8.44s-1.84 6.66-4.62 8.43c-.71.46-.43 1.55.41 1.57h.21c6.05 0 10.86-5.39 9.87-11.63-.76-4.84-5.07-8.42-9.97-8.37z"})
                                           "Brightness3Rounded"))

(ns reagent-material-ui.icons.height-two-tone
  "Imports @material-ui/icons/HeightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def height-two-tone (create-svg-icon (e "path" #js {"d" "M13 6.99h3L12 3 8 6.99h3v10.02H8L12 21l4-3.99h-3z"})
                                      "HeightTwoTone"))

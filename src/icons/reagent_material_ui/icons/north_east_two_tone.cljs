(ns reagent-material-ui.icons.north-east-two-tone
  "Imports @material-ui/icons/NorthEastTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def north-east-two-tone (create-svg-icon (e "path" #js {"d" "M9 5v2h6.59L4 18.59 5.41 20 17 8.41V15h2V5H9z"})
                                          "NorthEastTwoTone"))

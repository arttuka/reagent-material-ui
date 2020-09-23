(ns reagent-material-ui.icons.add-road-two-tone
  "Imports @material-ui/icons/AddRoadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-road-two-tone (create-svg-icon (e "path" #js {"d" "M20 18v-3h-2v3h-3v2h3v3h2v-3h3v-2zM18 4h2v9h-2zM4 4h2v16H4zM11 4h2v4h-2zM11 10h2v4h-2zM11 16h2v4h-2z"})
                                        "AddRoadTwoTone"))

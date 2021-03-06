(ns reagent-material-ui.icons.summarize-two-tone
  "Imports @material-ui/icons/SummarizeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def summarize-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 5H5v14h14v-9h-5V5zM8 17c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-4c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm0-4c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z", "opacity" ".3"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "8"}) (e "path" #js {"d" "M15 3H5c-1.1 0-1.99.9-1.99 2L3 19c0 1.1.89 2 1.99 2H19c1.1 0 2-.9 2-2V9l-6-6zm4 16H5V5h9v5h5v9z"}) (e "circle" #js {"cy" "12", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "16", "r" "1", "cx" "8"}))
                                         "SummarizeTwoTone"))

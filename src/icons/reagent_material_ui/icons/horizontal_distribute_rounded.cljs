(ns reagent-material-ui.icons.horizontal-distribute-rounded
  "Imports @material-ui/icons/HorizontalDistributeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-distribute-rounded (create-svg-icon (e "path" #js {"d" "M3 22c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1s1 .45 1 1v18c0 .55-.45 1-1 1zM21 2c-.55 0-1 .45-1 1v18c0 .55.45 1 1 1s1-.45 1-1V3c0-.55-.45-1-1-1zm-9 5c-.83 0-1.5.67-1.5 1.5v7c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5v-7c0-.83-.67-1.5-1.5-1.5z"})
                                                    "HorizontalDistributeRounded"))

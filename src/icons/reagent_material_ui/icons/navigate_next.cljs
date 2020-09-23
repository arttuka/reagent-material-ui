(ns reagent-material-ui.icons.navigate-next
  "Imports @material-ui/icons/NavigateNext as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigate-next (create-svg-icon (e "path" #js {"d" "M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"})
                                    "NavigateNext"))

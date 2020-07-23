(ns reagent-material-ui.icons.compare-two-tone
  "Imports @material-ui/icons/CompareTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def compare-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 5h-5v7l5 6zm-9 13v-6l-5 6z", "opacity" ".3"}) (e "path" #js {"d" "M19 3h-5v2h5v13l-5-6v9h5c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7-2h-2v2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h5v2h2V1zm-2 17H5l5-6v6z"}))
                                       "CompareTwoTone"))

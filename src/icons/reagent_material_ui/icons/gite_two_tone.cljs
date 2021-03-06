(ns reagent-material-ui.icons.gite-two-tone
  "Imports @material-ui/icons/GiteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def gite-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 12h10v5H4v-5zm16 5h-4v-6.17l2-2 2 2V17z", "opacity" ".3"}) (e "path" #js {"d" "M18 6H9V4H7v2H6l-4 4v9h20v-9l-4-4zM4 12h10v5H4v-5zm16 5h-4v-6.17l2-2 2 2V17z"}))
                                    "GiteTwoTone"))

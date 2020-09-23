(ns reagent-material-ui.icons.looks-4-two-tone
  "Imports @material-ui/icons/Looks4TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-4-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5.04 19h14V5h-14v14zm4-12h2v4h2V7h2v10h-2v-4h-4V7z", "opacity" ".3"}) (e "path" #js {"d" "M19.04 3h-14c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16h-14V5h14v14zm-6-2h2V7h-2v4h-2V7h-2v6h4z"}))
                                       "Looks4TwoTone"))

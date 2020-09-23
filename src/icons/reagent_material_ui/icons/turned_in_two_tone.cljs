(ns reagent-material-ui.icons.turned-in-two-tone
  "Imports @material-ui/icons/TurnedInTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def turned-in-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 3H7c-1.1 0-1.99.9-1.99 2L5 21l7-3 7 3V5c0-1.1-.9-2-2-2zm0 14.97l-4.21-1.81-.79-.34-.79.34L7 17.97V5h10v12.97z"}) (e "path" #js {"d" "M7 17.97l4.21-1.81.79-.34.79.34L17 17.97V5H7z", "opacity" ".3"}))
                                         "TurnedInTwoTone"))

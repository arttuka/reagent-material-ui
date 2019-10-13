(ns reagent-material-ui.icons.looks-4-outlined
  "Imports @material-ui/icons/Looks4Outlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-4-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M.04 0h24v24h-24V0z", "fill" "none"}) (e "path" #js {"d" "M19.04 3h-14c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16h-14V5h14v14zm-6-2h2V7h-2v4h-2V7h-2v6h4z"}))
                                       "Looks4Outlined"))

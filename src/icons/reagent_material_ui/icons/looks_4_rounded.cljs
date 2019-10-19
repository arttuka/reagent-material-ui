(ns reagent-material-ui.icons.looks-4-rounded
  "Imports @material-ui/icons/Looks4Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-4-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M.04 0h24v24h-24V0z", "fill" "none"}) (e "path" #js {"d" "M19.04 3h-14c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-5 14c-.55 0-1-.45-1-1v-3h-3c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1s1 .45 1 1v3h2V8c0-.55.45-1 1-1s1 .45 1 1v8c0 .55-.45 1-1 1z"}))
                                      "Looks4Rounded"))

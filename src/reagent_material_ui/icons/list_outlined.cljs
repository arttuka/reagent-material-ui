(ns reagent-material-ui.icons.list-outlined
  "Imports @material-ui/icons/ListOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def list-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "g" #js {"fill" "none"} (e "path" #js {"d" "M0 0h24v24H0V0z"}) (e "path" #js {"d" "M0 0h24v24H0V0z", "opacity" ".87"})) (e "path" #js {"d" "M3 13h2v-2H3v2zm0 4h2v-2H3v2zm0-8h2V7H3v2zm4 4h14v-2H7v2zm0 4h14v-2H7v2zM7 7v2h14V7H7zm-4 6h2v-2H3v2zm0 4h2v-2H3v2zm0-8h2V7H3v2zm4 4h14v-2H7v2zm0 4h14v-2H7v2zM7 7v2h14V7H7z"}))
                                    "ListOutlined"))

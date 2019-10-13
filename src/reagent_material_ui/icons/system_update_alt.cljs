(ns reagent-material-ui.icons.system-update-alt
  "Imports @material-ui/icons/SystemUpdateAlt as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def system-update-alt (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 .5h24v24H0z", "fill" "none"}) (e "path" #js {"d" "M12 16.5l4-4h-3v-9h-2v9H8l4 4zm9-13h-6v1.99h6v14.03H3V5.49h6V3.5H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2v-14c0-1.1-.9-2-2-2z"}))
                                        "SystemUpdateAlt"))

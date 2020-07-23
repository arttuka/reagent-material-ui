(ns reagent-material-ui.icons.turned-in-not-rounded
  "Imports @material-ui/icons/TurnedInNotRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def turned-in-not-rounded (create-svg-icon (e "path" #js {"d" "M17 3H7c-1.1 0-1.99.9-1.99 2L5 21l7-3 7 3V5c0-1.1-.9-2-2-2zm0 15l-5-2.18L7 18V6c0-.55.45-1 1-1h8c.55 0 1 .45 1 1v12z"})
                                            "TurnedInNotRounded"))

(ns reagent-material-ui.icons.remove-rounded
  "Imports @material-ui/icons/RemoveRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def remove-rounded (create-svg-icon (e "path" #js {"d" "M18 13H6c-.55 0-1-.45-1-1s.45-1 1-1h12c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                     "RemoveRounded"))

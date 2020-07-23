(ns reagent-material-ui.icons.fast-rewind
  "Imports @material-ui/icons/FastRewind as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-rewind (create-svg-icon (e "path" #js {"d" "M11 18V6l-8.5 6 8.5 6zm.5-6l8.5 6V6l-8.5 6z"})
                                  "FastRewind"))

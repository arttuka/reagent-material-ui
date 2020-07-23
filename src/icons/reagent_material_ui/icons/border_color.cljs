(ns reagent-material-ui.icons.border-color
  "Imports @material-ui/icons/BorderColor as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-color (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17.75 7L14 3.25l-10 10V17h3.75l10-10zm2.96-2.96c.39-.39.39-1.02 0-1.41L18.37.29a.9959.9959 0 0 0-1.41 0L15 2.25 18.75 6l1.96-1.96z"}) (e "path" #js {"d" "M0 20h24v4H0z", "fillOpacity" ".36"}))
                                   "BorderColor"))

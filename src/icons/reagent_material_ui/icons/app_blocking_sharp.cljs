(ns reagent-material-ui.icons.app-blocking-sharp
  "Imports @material-ui/icons/AppBlockingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def app-blocking-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 8c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm-2.5 4c0-1.38 1.12-2.5 2.5-2.5.42 0 .8.11 1.15.29l-3.36 3.36c-.18-.35-.29-.73-.29-1.15zm2.5 2.5c-.42 0-.8-.11-1.15-.29l3.36-3.36c.18.35.29.73.29 1.15 0 1.38-1.12 2.5-2.5 2.5z"}) (e "path" #js {"d" "M19 23v-6h-2v1H7V6h10v1h2V.94L5 1v22h14z"}))
                                         "AppBlockingSharp"))

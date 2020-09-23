(ns reagent-material-ui.icons.done
  "Imports @material-ui/icons/Done as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def done (create-svg-icon (e "path" #js {"d" "M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4L9 16.2z"})
                           "Done"))

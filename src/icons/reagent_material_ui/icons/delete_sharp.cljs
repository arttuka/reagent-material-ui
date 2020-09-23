(ns reagent-material-ui.icons.delete-sharp
  "Imports @material-ui/icons/DeleteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def delete-sharp (create-svg-icon (e "path" #js {"d" "M6 21h12V7H6v14zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"})
                                   "DeleteSharp"))

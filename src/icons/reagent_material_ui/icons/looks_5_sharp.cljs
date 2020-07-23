(ns reagent-material-ui.icons.looks-5-sharp
  "Imports @material-ui/icons/Looks5Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-5-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-6 6h-4v2h4v6H9v-2h4v-2H9V7h6v2z"})
                                    "Looks5Sharp"))

(ns reagent-material-ui.icons.looks-6-sharp
  "Imports @material-ui/icons/Looks6Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-6-sharp (create-svg-icon (e "path" #js {"d" "M11 15h2v-2h-2v2zM21 3H3v18h18V3zm-6 6h-4v2h4v6H9V7h6v2z"})
                                    "Looks6Sharp"))

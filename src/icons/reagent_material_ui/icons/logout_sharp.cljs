(ns reagent-material-ui.icons.logout-sharp
  "Imports @material-ui/icons/LogoutSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def logout-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5h7V3H3v18h9v-2H5z"}) (e "path" #js {"d" "M21 12l-4-4v3H9v2h8v3z"}))
                                   "LogoutSharp"))

(ns reagent-material-ui.icons.apartment-rounded
  "Imports @material-ui/icons/ApartmentRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def apartment-rounded (create-svg-icon (e "path" #js {"d" "M17 11V5c0-1.1-.9-2-2-2H9c-1.1 0-2 .9-2 2v2H5c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h6v-4h2v4h6c1.1 0 2-.9 2-2v-6c0-1.1-.9-2-2-2h-2zM7 19H5v-2h2v2zm0-4H5v-2h2v2zm0-4H5V9h2v2zm4 4H9v-2h2v2zm0-4H9V9h2v2zm0-4H9V5h2v2zm4 8h-2v-2h2v2zm0-4h-2V9h2v2zm0-4h-2V5h2v2zm4 12h-2v-2h2v2zm0-4h-2v-2h2v2z"})
                                        "ApartmentRounded"))

(ns reagent-material-ui.icons.storage-two-tone
  "Imports @material-ui/icons/StorageTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def storage-two-tone (create-svg-icon (e "path" #js {"d" "M2 20h20v-4H2v4zm2-3h2v2H4v-2zM2 4v4h20V4H2zm4 3H4V5h2v2zm-4 7h20v-4H2v4zm2-3h2v2H4v-2z"})
                                       "StorageTwoTone"))

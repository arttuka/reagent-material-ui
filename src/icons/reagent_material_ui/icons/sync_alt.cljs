(ns reagent-material-ui.icons.sync-alt
  "Imports @material-ui/icons/SyncAlt as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sync-alt (create-svg-icon (e "path" #js {"d" "M22 8l-4-4v3H3v2h15v3l4-4zM2 16l4 4v-3h15v-2H6v-3l-4 4z"})
                               "SyncAlt"))

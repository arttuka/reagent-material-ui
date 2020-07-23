(ns reagent-material-ui.icons.announcement-sharp
  "Imports @material-ui/icons/AnnouncementSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def announcement-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-9 9h-2V5h2v6zm0 4h-2v-2h2v2z"})
                                         "AnnouncementSharp"))

(ns reagent-material-ui.icons.sticky-note-2-outlined
  "Imports @material-ui/icons/StickyNote2Outlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sticky-note-2-outlined (create-svg-icon (e "path" #js {"d" "M19 5v9h-5v5H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h10l6-6V5c0-1.1-.9-2-2-2zm-7 11H7v-2h5v2zm5-4H7V8h10v2z"})
                                             "StickyNote2Outlined"))

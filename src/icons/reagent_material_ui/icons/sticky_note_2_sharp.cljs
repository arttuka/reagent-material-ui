(ns reagent-material-ui.icons.sticky-note-2-sharp
  "Imports @material-ui/icons/StickyNote2Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sticky-note-2-sharp (create-svg-icon (e "path" #js {"d" "M2.99 3L3 21h12l6-6V3H2.99zM7 8h10v2H7V8zm5 6H7v-2h5v2zm2 5.5V14h5.5L14 19.5z"})
                                          "StickyNote2Sharp"))

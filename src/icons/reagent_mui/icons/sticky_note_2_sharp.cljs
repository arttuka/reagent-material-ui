(ns reagent-mui.icons.sticky-note-2-sharp
  "Imports @mui/icons-material/StickyNote2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sticky-note-2-sharp (create-svg-icon (e "path" #js {"d" "M2.99 3 3 21h12l6-6V3H2.99zM7 8h10v2H7V8zm5 6H7v-2h5v2zm2 5.5V14h5.5L14 19.5z"})
                                          "StickyNote2Sharp"))

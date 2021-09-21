(ns reagent-mui.icons.sticky-note-2-two-tone
  "Imports @mui/icons-material/StickyNote2TwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sticky-note-2-two-tone (create-svg-icon [(e "path" #js {"d" "M5 5v14h9v-5h5V5H5zm7 9H7v-2h5v2zm5-4H7V8h10v2z", "opacity" ".3"}) (e "path" #js {"d" "M19 5v9h-5v5H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h10l6-6V5c0-1.1-.9-2-2-2zm-7 11H7v-2h5v2zm5-4H7V8h10v2z"})]
                                             "StickyNote2TwoTone"))

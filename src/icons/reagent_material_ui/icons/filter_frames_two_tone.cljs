(ns reagent-material-ui.icons.filter-frames-two-tone
  "Imports @material-ui/icons/FilterFramesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-frames-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 10h8v6H8z", "opacity" ".3"}) (e "path" #js {"d" "M20 4h-4l-4-4-4 4H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 16H4V6h4.52l3.52-3.5L15.52 6H20v14zM6 18h12V8H6v10zm2-8h8v6H8v-6z"}))
                                             "FilterFramesTwoTone"))

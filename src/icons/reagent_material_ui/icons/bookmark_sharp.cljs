(ns reagent-material-ui.icons.bookmark-sharp
  "Imports @material-ui/icons/BookmarkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bookmark-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18l7-3 7 3V3z"})
                                     "BookmarkSharp"))

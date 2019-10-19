(ns reagent-material-ui.icons.bookmarks-sharp
  "Imports @material-ui/icons/BookmarksSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def bookmarks-sharp (create-svg-icon (e "path" #js {"d" "M19 18l2 1V1H7v2h12v15zM17 5H3v18l7-3 7 3V5z"})
                                      "BookmarksSharp"))

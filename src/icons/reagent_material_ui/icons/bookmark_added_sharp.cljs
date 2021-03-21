(ns reagent-material-ui.icons.bookmark-added-sharp
  "Imports @material-ui/icons/BookmarkAddedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-added-sharp (create-svg-icon (e "path" #js {"d" "M19 21l-7-3-7 3V3h9c-.63.84-1 1.87-1 3 0 2.76 2.24 5 5 5 .34 0 .68-.03 1-.1V21zM17.83 9L15 6.17l1.41-1.41 1.41 1.41 3.54-3.54 1.41 1.41L17.83 9z"})
                                           "BookmarkAddedSharp"))

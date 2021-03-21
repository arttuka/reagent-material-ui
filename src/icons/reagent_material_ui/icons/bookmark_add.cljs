(ns reagent-material-ui.icons.bookmark-add
  "Imports @material-ui/icons/BookmarkAdd as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-add (create-svg-icon (e "path" #js {"d" "M21 7h-2v2h-2V7h-2V5h2V3h2v2h2v2zm-2 14l-7-3-7 3V5c0-1.1.9-2 2-2h7c-.63.84-1 1.87-1 3 0 2.76 2.24 5 5 5 .34 0 .68-.03 1-.1V21z"})
                                   "BookmarkAdd"))

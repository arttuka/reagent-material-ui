(ns reagent-material-ui.icons.bookmarks-two-tone
  "Imports @material-ui/icons/BookmarksTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bookmarks-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 1H8.99C7.89 1 7 1.9 7 3h10c1.1 0 2 .9 2 2v13l2 1V3c0-1.1-.9-2-2-2zm-4 4H5c-1.1 0-2 .9-2 2v16l7-3 7 3V7c0-1.1-.9-2-2-2zm0 14.97l-4.21-1.81-.79-.34-.79.34L5 19.97V7h10v12.97z"}) (e "path" #js {"d" "M5 19.97l5-2.15 5 2.15V7H5z", "opacity" ".3"}))
                                         "BookmarksTwoTone"))

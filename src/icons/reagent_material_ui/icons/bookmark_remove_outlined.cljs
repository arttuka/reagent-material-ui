(ns reagent-material-ui.icons.bookmark-remove-outlined
  "Imports @material-ui/icons/BookmarkRemoveOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bookmark-remove-outlined (create-svg-icon (e "path" #js {"d" "M17 11v6.97l-5-2.14-5 2.14V5h6V3H7c-1.1 0-2 .9-2 2v16l7-3 7 3V11h-2zm4-4h-6V5h6v2z"})
                                               "BookmarkRemoveOutlined"))

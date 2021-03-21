(ns reagent-material-ui.icons.bookmark-rounded
  "Imports @material-ui/icons/BookmarkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-rounded (create-svg-icon (e "path" #js {"d" "M17 3H7c-1.1 0-2 .9-2 2v14.48c0 .72.73 1.2 1.39.92L12 18l5.61 2.4c.66.28 1.39-.2 1.39-.92V5c0-1.1-.9-2-2-2z"})
                                       "BookmarkRounded"))

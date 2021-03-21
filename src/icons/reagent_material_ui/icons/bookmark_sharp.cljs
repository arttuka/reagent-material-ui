(ns reagent-material-ui.icons.bookmark-sharp
  "Imports @material-ui/icons/BookmarkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18l7-3 7 3V3z"})
                                     "BookmarkSharp"))

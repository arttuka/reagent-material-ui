(ns reagent-mui.icons.bookmark-sharp
  "Imports @mui/icons-material/BookmarkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18l7-3 7 3V3z"})
                                     "BookmarkSharp"))

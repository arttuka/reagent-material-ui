(ns reagent-mui.icons.bookmarks-sharp
  "Imports @mui/icons-material/BookmarksSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmarks-sharp (create-svg-icon (e "path" #js {"d" "m19 18 2 1V1H7v2h12v15zM17 5H3v18l7-3 7 3V5z"})
                                      "BookmarksSharp"))

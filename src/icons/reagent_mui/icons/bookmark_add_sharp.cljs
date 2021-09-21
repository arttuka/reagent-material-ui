(ns reagent-mui.icons.bookmark-add-sharp
  "Imports @mui/icons-material/BookmarkAddSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-add-sharp (create-svg-icon (e "path" #js {"d" "M21 7h-2v2h-2V7h-2V5h2V3h2v2h2v2zm-2 14-7-3-7 3V3h9c-.63.84-1 1.87-1 3 0 2.76 2.24 5 5 5 .34 0 .68-.03 1-.1V21z"})
                                         "BookmarkAddSharp"))

(ns reagent-mui.icons.collections-bookmark-sharp
  "Imports @mui/icons-material/CollectionsBookmarkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def collections-bookmark-sharp (create-svg-icon (e "path" #js {"d" "M4 6H2v16h16v-2H4V6zm18-4H6v16h16V2zm-2 10-2.5-1.5L15 12V4h5v8z"})
                                                 "CollectionsBookmarkSharp"))

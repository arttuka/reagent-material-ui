(ns reagent-mui.icons.collections-bookmark
  "Imports @mui/icons-material/CollectionsBookmark as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def collections-bookmark (create-svg-icon [(e "path" #js {"d" "M4 6H2v14c0 1.1.9 2 2 2h14v-2H4V6z"}) (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 10-2.5-1.5L15 12V4h5v8z"})]
                                           "CollectionsBookmark"))

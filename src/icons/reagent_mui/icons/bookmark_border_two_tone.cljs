(ns reagent-mui.icons.bookmark-border-two-tone
  "Imports @mui/icons-material/BookmarkBorderTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-border-two-tone (create-svg-icon (e "path" #js {"d" "M17 3H7c-1.1 0-2 .9-2 2v16l7-3 7 3V5c0-1.1-.9-2-2-2zm0 15-5-2.18L7 18V5h10v13z"})
                                               "BookmarkBorderTwoTone"))

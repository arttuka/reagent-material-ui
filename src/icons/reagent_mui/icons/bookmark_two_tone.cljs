(ns reagent-mui.icons.bookmark-two-tone
  "Imports @mui/icons-material/BookmarkTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-two-tone (create-svg-icon [(e "path" #js {"d" "m7 17.97 5-2.15 5 2.15V5H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 3H7c-1.1 0-2 .9-2 2v16l7-3 7 3V5c0-1.1-.9-2-2-2zm0 14.97-5-2.14-5 2.14V5h10v12.97z"})]
                                        "BookmarkTwoTone"))

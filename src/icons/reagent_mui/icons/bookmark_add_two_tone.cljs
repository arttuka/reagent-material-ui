(ns reagent-mui.icons.bookmark-add-two-tone
  "Imports @mui/icons-material/BookmarkAddTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bookmark-add-two-tone (create-svg-icon [(e "path" #js {"d" "M17 17.97V10.9c-2.28-.46-4-2.48-4-4.9 0-.34.03-.68.1-1H7v12.97l5-2.14 5 2.14z", "opacity" ".3"}) (e "path" #js {"d" "M21 7h-2v2h-2V7h-2V5h2V3h2v2h2v2zm-4 10.97-5-2.14-5 2.14V5h6.1c.15-.74.46-1.42.9-2H7c-1.1 0-2 .9-2 2v16l7-3 7 3V10.9c-.32.07-.66.1-1 .1-.34 0-.68-.03-1-.1v7.07z"})]
                                            "BookmarkAddTwoTone"))

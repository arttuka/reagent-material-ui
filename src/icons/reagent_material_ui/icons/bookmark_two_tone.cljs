(ns reagent-material-ui.icons.bookmark-two-tone
  "Imports @material-ui/icons/BookmarkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17.97l5-2.15 5 2.15V5H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 3H7c-1.1 0-2 .9-2 2v16l7-3 7 3V5c0-1.1-.9-2-2-2zm0 14.97l-5-2.14-5 2.14V5h10v12.97z"}))
                                        "BookmarkTwoTone"))

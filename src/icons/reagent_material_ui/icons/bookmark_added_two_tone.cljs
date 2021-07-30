(ns reagent-material-ui.icons.bookmark-added-two-tone
  "Imports @material-ui/icons/BookmarkAddedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmark-added-two-tone (create-svg-icon [(e "path" #js {"d" "M17 17.97V10.9c-2.28-.46-4-2.48-4-4.9 0-.34.03-.68.1-1H7v12.97l5-2.14 5 2.14z", "opacity" ".3"}) (e "path" #js {"d" "M17.83 9 15 6.17l1.41-1.41 1.41 1.41 3.54-3.54 1.41 1.41L17.83 9zM17 17.97l-5-2.14-5 2.14V5h6.1c.15-.74.46-1.42.9-2H7c-1.1 0-2 .9-2 2v16l7-3 7 3V10.9c-.32.07-.66.1-1 .1-.34 0-.68-.03-1-.1v7.07z"})]
                                              "BookmarkAddedTwoTone"))

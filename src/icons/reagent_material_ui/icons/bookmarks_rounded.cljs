(ns reagent-material-ui.icons.bookmarks-rounded
  "Imports @material-ui/icons/BookmarksRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bookmarks-rounded (create-svg-icon (e "path" #js {"d" "M15 5H5c-1.1 0-2 .9-2 2v14.48c0 .72.73 1.2 1.39.92L10 20l5.61 2.4c.66.28 1.39-.2 1.39-.92V7c0-1.1-.9-2-2-2zm5 15c.55 0 1-.45 1-1V3c0-1.1-.9-2-2-2H7c-.55 0-1 .45-1 1s.45 1 1 1h12v16c0 .55.45 1 1 1z"})
                                        "BookmarksRounded"))

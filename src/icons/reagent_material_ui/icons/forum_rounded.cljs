(ns reagent-material-ui.icons.forum-rounded
  "Imports @material-ui/icons/ForumRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def forum-rounded (create-svg-icon (e "path" #js {"d" "M20 6h-1v9H6v1c0 1.1.9 2 2 2h10l3.15 3.15c.31.31.85.09.85-.35V8c0-1.1-.9-2-2-2zm-3 5V4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v11.79c0 .45.54.67.85.35L6 13h9c1.1 0 2-.9 2-2z"})
                                    "ForumRounded"))

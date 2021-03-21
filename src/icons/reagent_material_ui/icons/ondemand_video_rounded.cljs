(ns reagent-material-ui.icons.ondemand-video-rounded
  "Imports @material-ui/icons/OndemandVideoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ondemand-video-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h4v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h4c1.1 0 1.99-.9 1.99-2L22 5c0-1.1-.9-2-2-2zm0 14H4V5h16v12z"}) (e "path" #js {"d" "M9.5 8.33v5.34c0 .79.88 1.27 1.54.84l4.15-2.67c.61-.39.61-1.29 0-1.68l-4.15-2.67c-.66-.43-1.54.05-1.54.84z"}))
                                             "OndemandVideoRounded"))

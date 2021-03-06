(ns reagent-material-ui.icons.featured-video-rounded
  "Imports @material-ui/icons/FeaturedVideoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def featured-video-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-7 10H6c-.55 0-1-.45-1-1V8c0-.55.45-1 1-1h7c.55 0 1 .45 1 1v5c0 .55-.45 1-1 1z"})
                                             "FeaturedVideoRounded"))

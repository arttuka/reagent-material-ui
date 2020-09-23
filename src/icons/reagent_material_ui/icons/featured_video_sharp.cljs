(ns reagent-material-ui.icons.featured-video-sharp
  "Imports @material-ui/icons/FeaturedVideoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def featured-video-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-11 9H3V5h9v7z"})
                                           "FeaturedVideoSharp"))

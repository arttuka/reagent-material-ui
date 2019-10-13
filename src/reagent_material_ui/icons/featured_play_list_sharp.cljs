(ns reagent-material-ui.icons.featured-play-list-sharp
  "Imports @material-ui/icons/FeaturedPlayListSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def featured-play-list-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-11 8H3V9h9v2zm0-4H3V5h9v2z"})
                                               "FeaturedPlayListSharp"))

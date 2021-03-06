(ns reagent-material-ui.icons.feed-sharp
  "Imports @material-ui/icons/FeedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def feed-sharp (create-svg-icon (e "path" #js {"d" "M16 3H3v18h18V8l-5-5zM7 7h5v2H7V7zm10 10H7v-2h10v2zm0-4H7v-2h10v2zm-2-4V5l4 4h-4z"})
                                 "FeedSharp"))

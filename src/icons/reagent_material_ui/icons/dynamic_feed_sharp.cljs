(ns reagent-material-ui.icons.dynamic-feed-sharp
  "Imports @material-ui/icons/DynamicFeedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dynamic-feed-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 8H6v9h11v-2H8z"}) (e "path" #js {"d" "M22 3H10v10h12V3zm-2 8h-8V7h8v4zM4 12H2v9h11v-2H4z"}))
                                         "DynamicFeedSharp"))

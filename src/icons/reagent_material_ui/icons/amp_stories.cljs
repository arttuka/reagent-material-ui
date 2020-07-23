(ns reagent-material-ui.icons.amp-stories
  "Imports @material-ui/icons/AmpStories as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def amp-stories (create-svg-icon (e "path" #js {"d" "M7 4h10v15H7zM3 6h2v11H3zM19 6h2v11h-2z"})
                                  "AmpStories"))

(ns reagent-material-ui.icons.amp-stories-rounded
  "Imports @material-ui/icons/AmpStoriesRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def amp-stories-rounded (create-svg-icon (e "path" #js {"d" "M16 4H8c-.55 0-1 .45-1 1v13c0 .55.45 1 1 1h8c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1zM4 6c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1s1-.45 1-1V7c0-.55-.45-1-1-1zM20 6c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1s1-.45 1-1V7c0-.55-.45-1-1-1z"})
                                          "AmpStoriesRounded"))

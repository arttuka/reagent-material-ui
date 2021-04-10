(ns reagent-material-ui.icons.amp-stories
  "Imports @material-ui/icons/AmpStories as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def amp-stories (create-svg-icon (e "path" #js {"d" "M7 4h10v15H7zM3 6h2v11H3zM19 6h2v11h-2z"})
                                  "AmpStories"))

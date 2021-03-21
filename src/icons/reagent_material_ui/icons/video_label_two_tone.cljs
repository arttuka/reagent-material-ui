(ns reagent-material-ui.icons.video-label-two-tone
  "Imports @material-ui/icons/VideoLabelTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def video-label-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 5h18v11H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 13H3V5h18v11z"}))
                                           "VideoLabelTwoTone"))

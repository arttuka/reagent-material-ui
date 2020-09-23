(ns reagent-material-ui.icons.audiotrack-two-tone
  "Imports @material-ui/icons/AudiotrackTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def audiotrack-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "2", "cx" "10", "opacity" ".3"}) (e "path" #js {"d" "M10 21c2.21 0 4-1.79 4-4V7h4V3h-6v10.55c-.59-.34-1.27-.55-2-.55-2.21 0-4 1.79-4 4s1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2z"}))
                                          "AudiotrackTwoTone"))

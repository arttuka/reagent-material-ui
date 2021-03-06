(ns reagent-material-ui.icons.burst-mode-rounded
  "Imports @material-ui/icons/BurstModeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def burst-mode-rounded (create-svg-icon (e "path" #js {"d" "M2 5c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1s1-.45 1-1V6c0-.55-.45-1-1-1zm4 0c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1s1-.45 1-1V6c0-.55-.45-1-1-1zm15 0H11c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm-9 10l2.12-2.83L15.5 14l1.88-2.5L20 15h-8z"})
                                         "BurstModeRounded"))

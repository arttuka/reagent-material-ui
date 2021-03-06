(ns reagent-material-ui.icons.splitscreen-sharp
  "Imports @material-ui/icons/SplitscreenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def splitscreen-sharp (create-svg-icon (e "path" #js {"d" "M18 4v5H6V4h12m2-2H4v9h16V2zm-2 13v5H6v-5h12m2-2H4v9h16v-9z"})
                                        "SplitscreenSharp"))

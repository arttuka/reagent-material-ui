(ns reagent-material-ui.icons.padding-sharp
  "Imports @material-ui/icons/PaddingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def padding-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 6H7V7h2v2zm4 0h-2V7h2v2zm4 0h-2V7h2v2z"})
                                    "PaddingSharp"))

(ns reagent-material-ui.icons.turned-in-sharp
  "Imports @material-ui/icons/TurnedInSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def turned-in-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18l7-3 7 3V3z"})
                                      "TurnedInSharp"))

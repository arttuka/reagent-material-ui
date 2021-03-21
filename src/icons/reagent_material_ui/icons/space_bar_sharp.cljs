(ns reagent-material-ui.icons.space-bar-sharp
  "Imports @material-ui/icons/SpaceBarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def space-bar-sharp (create-svg-icon (e "path" #js {"d" "M18 9v4H6V9H4v6h16V9h-2z"})
                                      "SpaceBarSharp"))

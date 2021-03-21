(ns reagent-material-ui.icons.gite-sharp
  "Imports @material-ui/icons/GiteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def gite-sharp (create-svg-icon (e "path" #js {"d" "M18 6H9V4H7v2H6l-4 4v9h20v-9l-4-4zM4 12h10v5H4v-5zm16 5h-4v-6.17l2-2 2 2V17z"})
                                 "GiteSharp"))

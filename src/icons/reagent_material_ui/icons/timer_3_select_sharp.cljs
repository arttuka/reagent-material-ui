(ns reagent-material-ui.icons.timer-3-select-sharp
  "Imports @material-ui/icons/Timer3SelectSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def timer-3-select-sharp (create-svg-icon (e "path" #js {"d" "M21 11v2h-4v1h4v5h-6v-2h4v-1h-4v-5h6zM4 5v3h6v2.5H4v3h6V16H4v3h9V5H4z"})
                                           "Timer3SelectSharp"))

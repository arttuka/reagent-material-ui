(ns reagent-material-ui.icons.timer-10-select-sharp
  "Imports @material-ui/icons/Timer10SelectSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def timer-10-select-sharp (create-svg-icon (e "path" #js {"d" "M13 8v8h-3V8h3m3-3H7v14h9V5zM1 8h2v11h3V5H1v3zm22 3h-6v5h4v1h-4v2h6v-5h-4v-1h4v-2z"})
                                            "Timer10SelectSharp"))

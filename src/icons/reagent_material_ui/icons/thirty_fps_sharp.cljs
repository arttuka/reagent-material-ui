(ns reagent-material-ui.icons.thirty-fps-sharp
  "Imports @material-ui/icons/ThirtyFpsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def thirty-fps-sharp (create-svg-icon (e "path" #js {"d" "M2 5v3h6v2.5H3v3h5V16H2v3h9V5H2zm17 3v8h-4V8h4m3-3H12v14h10V5z"})
                                       "ThirtyFpsSharp"))

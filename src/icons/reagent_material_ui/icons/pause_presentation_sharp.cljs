(ns reagent-material-ui.icons.pause-presentation-sharp
  "Imports @material-ui/icons/PausePresentationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def pause-presentation-sharp (create-svg-icon (e "path" #js {"d" "M1 3v18h22V3H1zm20 16H3V5h18v14zM9 8h2v8H9zm4 0h2v8h-2z"})
                                               "PausePresentationSharp"))

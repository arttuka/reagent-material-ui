(ns reagent-material-ui.icons.priority-high-sharp
  "Imports @material-ui/icons/PriorityHighSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def priority-high-sharp (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "19", "r" "2"}) (e "path" #js {"d" "M10 3h4v12h-4z"})]
                                          "PriorityHighSharp"))

(ns reagent-material-ui.icons.priority-high-rounded
  "Imports @material-ui/icons/PriorityHighRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def priority-high-rounded (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "19", "r" "2"}) (e "path" #js {"d" "M12 3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2s2-.9 2-2V5c0-1.1-.9-2-2-2z"})]
                                            "PriorityHighRounded"))

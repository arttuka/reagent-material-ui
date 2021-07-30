(ns reagent-material-ui.icons.sports-cricket-sharp
  "Imports @material-ui/icons/SportsCricketSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-cricket-sharp (create-svg-icon [(e "path" #js {"d" "M15.05 12.81 6.56 4.32a.9959.9959 0 0 0-1.41 0L2.32 7.15c-.39.39-.39 1.02 0 1.41l8.49 8.49c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41zm-.7088 4.9462 1.4142-1.4142 4.2426 4.2426-1.4142 1.4142z"}) (e "circle" #js {"cx" "18.5", "cy" "5.5", "r" "3.5"})]
                                           "SportsCricketSharp"))

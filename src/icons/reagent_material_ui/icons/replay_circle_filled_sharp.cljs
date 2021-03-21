(ns reagent-material-ui.icons.replay-circle-filled-sharp
  "Imports @material-ui/icons/ReplayCircleFilledSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def replay-circle-filled-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm6 10.5c0 3.31-2.69 6-6 6s-6-2.69-6-6h2c0 2.21 1.79 4 4 4s4-1.79 4-4-1.79-4-4-4v3l-4-4 4-4v3c3.31 0 6 2.69 6 6z"})
                                                 "ReplayCircleFilledSharp"))

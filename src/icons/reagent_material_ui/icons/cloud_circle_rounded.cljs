(ns reagent-material-ui.icons.cloud-circle-rounded
  "Imports @material-ui/icons/CloudCircleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cloud-circle-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm4 14H8.5C6.57 16 5 14.43 5 12.5c0-1.86 1.46-3.37 3.29-3.48C8.88 7.55 10.31 6.5 12 6.5c2.04 0 3.75 1.53 4 3.5 1.66 0 3 1.34 3 3s-1.34 3-3 3z"})
                                           "CloudCircleRounded"))

(ns reagent-material-ui.icons.phonelink-ring-sharp
  "Imports @material-ui/icons/PhonelinkRingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def phonelink-ring-sharp (create-svg-icon (e "path" #js {"d" "m20.1 7.7-1 1c1.8 1.8 1.8 4.6 0 6.5l1 1c2.5-2.3 2.5-6.1 0-8.5zM18 9.8l-1 1c.5.7.5 1.6 0 2.3l1 1c1.2-1.2 1.2-3 0-4.3zM16 1H2v22h14V1zm-2 19H4V4h10v16z"})
                                           "PhonelinkRingSharp"))

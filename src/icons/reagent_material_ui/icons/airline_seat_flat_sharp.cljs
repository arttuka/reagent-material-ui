(ns reagent-material-ui.icons.airline-seat-flat-sharp
  "Imports @material-ui/icons/AirlineSeatFlatSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def airline-seat-flat-sharp (create-svg-icon (e "path" #js {"d" "M22 7v6H9V7h13zM2 14v2h6v2h8v-2h6v-2H2zm5.14-1.9c1.16-1.19 1.14-3.08-.04-4.24-1.19-1.16-3.08-1.14-4.24.04-1.16 1.19-1.14 3.08.04 4.24 1.19 1.16 3.08 1.14 4.24-.04z"})
                                              "AirlineSeatFlatSharp"))

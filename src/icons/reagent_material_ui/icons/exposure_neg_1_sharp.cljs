(ns reagent-material-ui.icons.exposure-neg-1-sharp
  "Imports @material-ui/icons/ExposureNeg1Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exposure-neg-1-sharp (create-svg-icon (e "path" #js {"d" "M4 11v2h8v-2H4zm15 7h-2V7.38L14 8.4V6.7L18.7 5h.3v13z"})
                                           "ExposureNeg1Sharp"))

(ns reagent-material-ui.icons.exposure-neg-1-rounded
  "Imports @material-ui/icons/ExposureNeg1Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exposure-neg-1-rounded (create-svg-icon (e "path" #js {"d" "M4 12c0 .55.45 1 1 1h6c.55 0 1-.45 1-1s-.45-1-1-1H5c-.55 0-1 .45-1 1zm15 6h-2V7.38L14 8.4V6.7L18.7 5h.3v13z"})
                                             "ExposureNeg1Rounded"))

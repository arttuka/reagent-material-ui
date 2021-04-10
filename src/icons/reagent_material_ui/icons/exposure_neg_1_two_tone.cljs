(ns reagent-material-ui.icons.exposure-neg-1-two-tone
  "Imports @material-ui/icons/ExposureNeg1TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exposure-neg-1-two-tone (create-svg-icon (e "path" #js {"d" "M19 18V5h-.3L14 6.7v1.7l3-1.02V18zM4 11h8v2H4z"})
                                              "ExposureNeg1TwoTone"))

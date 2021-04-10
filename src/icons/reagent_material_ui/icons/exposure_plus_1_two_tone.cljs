(ns reagent-material-ui.icons.exposure-plus-1-two-tone
  "Imports @material-ui/icons/ExposurePlus1TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exposure-plus-1-two-tone (create-svg-icon (e "path" #js {"d" "M20 18V5h-.3L15 6.7v1.7l3-1.02V18zm-10-1v-4h4v-2h-4V7H8v4H4v2h4v4z"})
                                               "ExposurePlus1TwoTone"))

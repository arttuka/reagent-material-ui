(ns reagent-material-ui.icons.border-outer-rounded
  "Imports @material-ui/icons/BorderOuterRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def border-outer-rounded (create-svg-icon (e "path" #js {"d" "M13 7h-2v2h2V7zm0 4h-2v2h2v-2zm4 0h-2v2h2v-2zM3 5v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2zm16 14H5V5h14v14zm-6-4h-2v2h2v-2zm-4-4H7v2h2v-2z"})
                                           "BorderOuterRounded"))

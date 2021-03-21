(ns reagent-material-ui.icons.door-back-sharp
  "Imports @material-ui/icons/DoorBackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def door-back-sharp (create-svg-icon (e "path" #js {"d" "M19 19V3H5v16H3v2h18v-2h-2zm-8-6H9v-2h2v2z"})
                                      "DoorBackSharp"))

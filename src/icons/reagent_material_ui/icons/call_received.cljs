(ns reagent-material-ui.icons.call-received
  "Imports @material-ui/icons/CallReceived as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-received (create-svg-icon (e "path" #js {"d" "M20 5.41 18.59 4 7 15.59V9H5v10h10v-2H8.41z"})
                                    "CallReceived"))

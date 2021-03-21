(ns reagent-material-ui.icons.call-received-two-tone
  "Imports @material-ui/icons/CallReceivedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-received-two-tone (create-svg-icon (e "path" #js {"d" "M15 17H8.41L20 5.41 18.59 4 7 15.59V9H5v10h10z"})
                                             "CallReceivedTwoTone"))

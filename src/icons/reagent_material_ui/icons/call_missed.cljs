(ns reagent-material-ui.icons.call-missed
  "Imports @material-ui/icons/CallMissed as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-missed (create-svg-icon (e "path" #js {"d" "M19.59 7L12 14.59 6.41 9H11V7H3v8h2v-4.59l7 7 9-9z"})
                                  "CallMissed"))

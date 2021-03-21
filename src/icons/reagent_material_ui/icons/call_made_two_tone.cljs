(ns reagent-material-ui.icons.call-made-two-tone
  "Imports @material-ui/icons/CallMadeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-made-two-tone (create-svg-icon (e "path" #js {"d" "M5.41 20L17 8.41V15h2V5H9v2h6.59L4 18.59z"})
                                         "CallMadeTwoTone"))

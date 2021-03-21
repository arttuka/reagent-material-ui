(ns reagent-material-ui.icons.call-made-rounded
  "Imports @material-ui/icons/CallMadeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-made-rounded (create-svg-icon (e "path" #js {"d" "M18 5h-6.59c-.89 0-1.34 1.08-.71 1.71l2.59 2.59-8.59 8.59c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l8.59-8.59 2.59 2.59c.63.63 1.71.18 1.71-.71V6c0-.55-.45-1-1-1z"})
                                        "CallMadeRounded"))

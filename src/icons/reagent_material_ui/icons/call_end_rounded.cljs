(ns reagent-material-ui.icons.call-end-rounded
  "Imports @material-ui/icons/CallEndRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-end-rounded (create-svg-icon (e "path" #js {"d" "M12 8c-1.09 0-6.58.1-10.91 4.71-.38.4-.38 1.02.01 1.41l2.29 2.27c.35.35.91.39 1.3.09L7.6 14.3c.25-.19.4-.49.4-.8v-2.87c1.26-.4 2.6-.63 4-.63s2.74.23 4 .63v2.87c0 .31.15.61.4.8l2.91 2.18c.4.3.95.26 1.3-.09l2.29-2.27c.39-.39.39-1.01.01-1.41C18.58 8.1 13.09 8 12 8z"})
                                       "CallEndRounded"))

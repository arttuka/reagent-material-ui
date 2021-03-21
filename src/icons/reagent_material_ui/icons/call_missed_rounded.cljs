(ns reagent-material-ui.icons.call-missed-rounded
  "Imports @material-ui/icons/CallMissedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-missed-rounded (create-svg-icon (e "path" #js {"d" "M20.3 7.7a.9959.9959 0 0 0-1.41 0L12 14.59l-4.29-4.3L9.3 8.7c.62-.62.18-1.7-.71-1.7H4c-.55 0-1 .45-1 1v4.59c0 .89 1.08 1.34 1.71.71l1.59-1.59 5 5c.39.39 1.02.39 1.41 0l7.59-7.59c.38-.39.38-1.03 0-1.42z"})
                                          "CallMissedRounded"))

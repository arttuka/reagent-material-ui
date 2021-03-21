(ns reagent-material-ui.icons.call-merge-rounded
  "Imports @material-ui/icons/CallMergeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-merge-rounded (create-svg-icon (e "path" #js {"d" "M15 15.59L13.59 17l2.3 2.3c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-2.3-2.3zM11.65 3.35l-3.8 3.8c-.31.31-.09.85.36.85H11v5.59l-4.3 4.3c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L13 14.41V8h2.79c.45 0 .67-.54.35-.85l-3.79-3.79c-.19-.2-.51-.2-.7-.01z"})
                                         "CallMergeRounded"))

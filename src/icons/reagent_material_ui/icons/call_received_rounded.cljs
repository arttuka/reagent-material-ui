(ns reagent-material-ui.icons.call-received-rounded
  "Imports @material-ui/icons/CallReceivedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-received-rounded (create-svg-icon (e "path" #js {"d" "M6 19h6.59c.89 0 1.34-1.08.71-1.71l-2.59-2.59 8.59-8.59c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L9.3 13.29 6.71 10.7c-.63-.62-1.71-.18-1.71.71V18c0 .55.45 1 1 1z"})
                                            "CallReceivedRounded"))

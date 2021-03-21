(ns reagent-material-ui.icons.call-to-action-rounded
  "Imports @material-ui/icons/CallToActionRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-to-action-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-3.5 13h-9c-.83 0-1.5-.67-1.5-1.5S6.67 14 7.5 14h9c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5z"})
                                             "CallToActionRounded"))

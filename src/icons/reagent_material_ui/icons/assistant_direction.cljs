(ns reagent-material-ui.icons.assistant-direction
  "Imports @material-ui/icons/AssistantDirection as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def assistant-direction (create-svg-icon (e "path" #js {"d" "M14 10H9c-.6 0-1 .4-1 1v4h2v-3h4v2.5l3.5-3.5L14 7.5V10zm-2-9C5.9 1 1 5.9 1 12s4.9 11 11 11 11-4.9 11-11S18.1 1 12 1zm7.73 11.58l-7.19 7.22c-.35.27-.79.27-1.15 0L4.2 12.58c-.27-.36-.27-.8 0-1.16l7.19-7.22c.35-.27.79-.27 1.15 0l7.19 7.22c.36.27.36.8 0 1.16z"})
                                          "AssistantDirection"))

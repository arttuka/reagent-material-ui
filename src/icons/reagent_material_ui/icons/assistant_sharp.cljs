(ns reagent-material-ui.icons.assistant-sharp
  "Imports @material-ui/icons/AssistantSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def assistant-sharp (create-svg-icon (e "path" #js {"d" "M21 2H3v18h6l3 3 3-3h6V2zm-7.12 10.88L12 17l-1.88-4.12L6 11l4.12-1.88L12 5l1.88 4.12L18 11l-4.12 1.88z"})
                                      "AssistantSharp"))

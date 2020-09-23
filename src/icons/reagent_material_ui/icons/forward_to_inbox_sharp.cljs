(ns reagent-material-ui.icons.forward-to-inbox-sharp
  "Imports @material-ui/icons/ForwardToInboxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def forward-to-inbox-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h11v-2H4V8l8 5 8-5v5h2V4zm-10 7L4 6h16l-8 5zm7 4l4 4-4 4v-3h-4v-2h4v-3z"})
                                             "ForwardToInboxSharp"))

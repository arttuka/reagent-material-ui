(ns reagent-mui.icons.forward-to-inbox-sharp
  "Imports @mui/icons-material/ForwardToInboxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def forward-to-inbox-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h11v-2H4V8l8 5 8-5v5h2V4zm-10 7L4 6h16l-8 5zm7 4 4 4-4 4v-3h-4v-2h4v-3z"})
                                             "ForwardToInboxSharp"))

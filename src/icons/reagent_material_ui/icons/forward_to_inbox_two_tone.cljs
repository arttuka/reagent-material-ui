(ns reagent-material-ui.icons.forward-to-inbox-two-tone
  "Imports @material-ui/icons/ForwardToInboxTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def forward-to-inbox-two-tone (create-svg-icon [(e "path" #js {"d" "M13 18H4V8l8 5 8-5v5h-2c-2.76 0-5 2.24-5 5zm-1-7L4 6h16l-8 5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h9v-2H4V8l8 5 8-5v5h2V6c0-1.1-.9-2-2-2zm-8 7L4 6h16l-8 5zm7 4 4 4-4 4v-3h-4v-2h4v-3z"})]
                                                "ForwardToInboxTwoTone"))

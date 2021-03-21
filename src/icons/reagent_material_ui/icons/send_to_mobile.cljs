(ns reagent-material-ui.icons.send-to-mobile
  "Imports @material-ui/icons/SendToMobile as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def send-to-mobile (create-svg-icon (e "path" #js {"d" "M17 17h2v4c0 1.1-.9 2-2 2H7c-1.1 0-2-.9-2-2V3c0-1.1.9-1.99 2-1.99L17 1c1.1 0 2 .9 2 2v4h-2V6H7v12h10v-1zm5-5l-4-4v3h-5v2h5v3l4-4z"})
                                     "SendToMobile"))

(ns reagent-material-ui.icons.payments-rounded
  "Imports @material-ui/icons/PaymentsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def payments-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 7c-.55 0-1 .45-1 1v10c0 1.1.9 2 2 2h16c.55 0 1-.45 1-1s-.45-1-1-1H3V8c0-.55-.45-1-1-1z"}) (e "path" #js {"d" "M21 4H7c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM7 14v-2c1.1 0 2 .9 2 2H7zm0-6V6h2c0 1.1-.9 2-2 2zm7 5c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm7 1h-2c0-1.1.9-2 2-2v2zm0-6c-1.1 0-2-.9-2-2h2v2z"}))
                                       "PaymentsRounded"))

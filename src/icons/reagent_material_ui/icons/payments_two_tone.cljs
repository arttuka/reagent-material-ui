(ns reagent-material-ui.icons.payments-two-tone
  "Imports @material-ui/icons/PaymentsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def payments-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 6H3v8h14V6zm-7 7c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z", "opacity" ".3"}) (e "path" #js {"d" "M17 4H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zM3 14V6h14v8H3z"}) (e "path" #js {"d" "M10 7c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3zM23 7v11c0 1.1-.9 2-2 2H4v-2h17V7h2z"}))
                                        "PaymentsTwoTone"))

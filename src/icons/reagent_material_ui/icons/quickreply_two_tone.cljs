(ns reagent-material-ui.icons.quickreply-two-tone
  "Imports @material-ui/icons/QuickreplyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def quickreply-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 4v13.17L5.17 16H15v-6h5V4z", "opacity" ".3"}) (e "path" #js {"d" "M5.17 16L4 17.17V4h16v6h2V4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9v-2H5.17z"}) (e "path" #js {"d" "M19 23l3.5-7h-2.2l1.7-4h-5v6h2z"}))
                                          "QuickreplyTwoTone"))

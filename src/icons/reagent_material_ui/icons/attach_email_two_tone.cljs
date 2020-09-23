(ns reagent-material-ui.icons.attach-email-two-tone
  "Imports @material-ui/icons/AttachEmailTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def attach-email-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 6l8 5 8-5v3h2V4c0-1.1-.9-2-2-2H3c-1.1 0-1.99.9-1.99 2L1 16c0 1.1.9 2 2 2h10v-2H3V6zm16-2l-8 5-8-5h16z"}) (e "path" #js {"d" "M21 14v4c0 1.1-.9 2-2 2s-2-.9-2-2v-4.5c0-.28.22-.5.5-.5s.5.22.5.5V18h2v-4.5c0-1.38-1.12-2.5-2.5-2.5S15 12.12 15 13.5V18c0 2.21 1.79 4 4 4s4-1.79 4-4v-4h-2z"}))
                                            "AttachEmailTwoTone"))

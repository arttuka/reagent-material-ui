(ns reagent-material-ui.icons.do-not-disturb-on-total-silence
  "Imports @material-ui/icons/DoNotDisturbOnTotalSilence as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def do-not-disturb-on-total-silence (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm0-14c-3.3 0-6 2.7-6 6s2.7 6 6 6 6-2.7 6-6-2.6-6-6-6zm3 7H9v-2h6v2z"})
                                                      "DoNotDisturbOnTotalSilence"))

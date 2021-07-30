(ns reagent-material-ui.icons.remove-from-queue-two-tone
  "Imports @material-ui/icons/RemoveFromQueueTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def remove-from-queue-two-tone (create-svg-icon [(e "path" #js {"d" "M3 17h18V5H3v12zm5-7h8v2H8v-2z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.11 0-2 .89-2 2v12c0 1.1.89 2 2 2h5v2h8v-2h5c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm0 14H3V5h18v12zM8 10h8v2H8z"})]
                                                 "RemoveFromQueueTwoTone"))

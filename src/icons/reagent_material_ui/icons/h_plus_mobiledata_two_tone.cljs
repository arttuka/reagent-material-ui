(ns reagent-material-ui.icons.h-plus-mobiledata-two-tone
  "Imports @material-ui/icons/HPlusMobiledataTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def h-plus-mobiledata-two-tone (create-svg-icon (e "path" #js {"d" "M12 11H6V7H4v10h2v-4h6v4h2V7h-2v4zm10 0h-2V9h-2v2h-2v2h2v2h2v-2h2v-2z"})
                                                 "HPlusMobiledataTwoTone"))

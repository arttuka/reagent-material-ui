(ns reagent-material-ui.icons.g-mobiledata-two-tone
  "Imports @material-ui/icons/GMobiledataTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def g-mobiledata-two-tone (create-svg-icon (e "path" #js {"d" "M12 11v2h2v2H9V9h7c0-1.1-.9-2-2-2H9c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h5c1.1 0 2-.9 2-2v-4h-4z"})
                                            "GMobiledataTwoTone"))

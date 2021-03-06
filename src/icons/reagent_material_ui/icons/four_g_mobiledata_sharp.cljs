(ns reagent-material-ui.icons.four-g-mobiledata-sharp
  "Imports @material-ui/icons/FourGMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def four-g-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M9 7H7v5H5V7H3v7h4v3h2v-3h2v-2H9V7zm8 4v2h2v2h-5V9h7V7h-9v10h9v-6h-4z"})
                                              "FourGMobiledataSharp"))

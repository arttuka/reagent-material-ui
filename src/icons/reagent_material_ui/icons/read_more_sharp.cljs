(ns reagent-material-ui.icons.read-more-sharp
  "Imports @material-ui/icons/ReadMoreSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def read-more-sharp (create-svg-icon (e "path" #js {"d" "M13 7h9v2h-9zM13 15h9v2h-9zM16 11h6v2h-6zM13 12L8 7v4H2v2h6v4z"})
                                      "ReadMoreSharp"))

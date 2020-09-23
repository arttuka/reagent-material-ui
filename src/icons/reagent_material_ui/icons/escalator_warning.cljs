(ns reagent-material-ui.icons.escalator-warning
  "Imports @material-ui/icons/EscalatorWarning as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def escalator-warning (create-svg-icon (e "path" #js {"d" "M6.5 2c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm9 7.5c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5S17.83 8 17 8s-1.5.67-1.5 1.5zm3 2.5h-2.84c-.58.01-1.14.32-1.45.86l-.92 1.32L9.72 8c-.37-.63-1.03-.99-1.71-1H5c-1.1 0-2 .9-2 2v6h1.5v7h5V11.61L12.03 16h2.2l.77-1.1V22h4v-5h1v-3.5c0-.82-.67-1.5-1.5-1.5z"})
                                        "EscalatorWarning"))

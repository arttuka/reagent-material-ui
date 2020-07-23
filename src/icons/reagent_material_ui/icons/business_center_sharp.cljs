(ns reagent-material-ui.icons.business-center-sharp
  "Imports @material-ui/icons/BusinessCenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def business-center-sharp (create-svg-icon (e "path" #js {"d" "M10 16v-1H3.01v6H21v-6h-7v1h-4zm12-9h-6V5l-2-2h-4L8 5v2H2v7h8v-2h4v2h8V7zm-8 0h-4V5h4v2z"})
                                            "BusinessCenterSharp"))

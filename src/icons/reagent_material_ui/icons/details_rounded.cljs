(ns reagent-material-ui.icons.details-rounded
  "Imports @material-ui/icons/DetailsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def details-rounded (create-svg-icon (e "path" #js {"d" "M3.84 5.49l7.29 12.96c.38.68 1.36.68 1.74 0l7.29-12.96c.38-.67-.11-1.49-.87-1.49H4.71c-.76 0-1.25.82-.87 1.49zM6.38 6h11.25L12 16 6.38 6z"})
                                      "DetailsRounded"))

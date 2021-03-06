(ns reagent-material-ui.icons.edit-attributes-rounded
  "Imports @material-ui/icons/EditAttributesRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def edit-attributes-rounded (create-svg-icon (e "path" #js {"d" "M17 7H7c-2.76 0-5 2.24-5 5s2.24 5 5 5h10c2.76 0 5-2.24 5-5s-2.24-5-5-5zm-9.66 6.59l-.81-.82c-.29-.29-.29-.77 0-1.06.29-.29.77-.29 1.06 0l.46.46 1.94-1.94c.3-.3.77-.29 1.07 0 .29.29.29.77 0 1.06l-2.29 2.29c-.4.4-1.04.4-1.43.01z"})
                                              "EditAttributesRounded"))

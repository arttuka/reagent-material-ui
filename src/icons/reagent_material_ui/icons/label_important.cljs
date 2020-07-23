(ns reagent-material-ui.icons.label-important
  "Imports @material-ui/icons/LabelImportant as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-important (create-svg-icon (e "path" #js {"d" "M3.5 18.99l11 .01c.67 0 1.27-.33 1.63-.84L20.5 12l-4.37-6.16c-.36-.51-.96-.84-1.63-.84l-11 .01L8.34 12 3.5 18.99z"})
                                      "LabelImportant"))

(ns reagent-material-ui.icons.work-outline-sharp
  "Imports @material-ui/icons/WorkOutlineSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def work-outline-sharp (create-svg-icon (e "path" #js {"d" "M14 6V4h-4v2h4zM4 8v11h16V8H4zm18-2v15H2.01V6H8V4c0-1.1.9-2 2-2h4c1.1 0 2 .9 2 2v2h6z"})
                                         "WorkOutlineSharp"))

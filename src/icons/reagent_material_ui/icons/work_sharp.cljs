(ns reagent-material-ui.icons.work-sharp
  "Imports @material-ui/icons/WorkSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def work-sharp (create-svg-icon (e "path" #js {"d" "M22 6h-6V4c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v2H2v15h20V6zm-8 0h-4V4h4v2z"})
                                 "WorkSharp"))

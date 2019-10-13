(ns reagent-material-ui.icons.subject-sharp
  "Imports @material-ui/icons/SubjectSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def subject-sharp (create-svg-icon (e "path" #js {"d" "M14 17H4v2h10v-2zm6-8H4v2h16V9zM4 15h16v-2H4v2zM4 5v2h16V5H4z"})
                                    "SubjectSharp"))

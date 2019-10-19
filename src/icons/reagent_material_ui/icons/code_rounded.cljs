(ns reagent-material-ui.icons.code-rounded
  "Imports @material-ui/icons/CodeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def code-rounded (create-svg-icon (e "path" #js {"d" "M8.7 15.9L4.8 12l3.9-3.9c.39-.39.39-1.01 0-1.4a.9839.9839 0 00-1.4 0l-4.59 4.59c-.39.39-.39 1.02 0 1.41l4.59 4.6c.39.39 1.01.39 1.4 0 .39-.39.39-1.01 0-1.4zm6.6 0l3.9-3.9-3.9-3.9a.9839.9839 0 010-1.4c.39-.39 1.01-.39 1.4 0l4.59 4.59c.39.39.39 1.02 0 1.41l-4.59 4.6c-.39.39-1.01.39-1.4 0a.9839.9839 0 010-1.4z"})
                                   "CodeRounded"))

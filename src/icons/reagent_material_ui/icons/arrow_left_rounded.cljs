(ns reagent-material-ui.icons.arrow-left-rounded
  "Imports @material-ui/icons/ArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-left-rounded (create-svg-icon (e "path" #js {"d" "M12.29 8.71L9.7 11.3c-.39.39-.39 1.02 0 1.41l2.59 2.59c.63.63 1.71.18 1.71-.71V9.41c0-.89-1.08-1.33-1.71-.7z"})
                                         "ArrowLeftRounded"))

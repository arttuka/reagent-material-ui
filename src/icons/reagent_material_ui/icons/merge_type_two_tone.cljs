(ns reagent-material-ui.icons.merge-type-two-tone
  "Imports @material-ui/icons/MergeTypeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def merge-type-two-tone (create-svg-icon (e "path" #js {"d" "M5.59 19L7 20.41l6-6V8h3.5L12 3.5 7.5 8H11v5.59zm11.407 1.41l-3.408-3.407 1.4-1.407 3.41 3.408z"})
                                          "MergeTypeTwoTone"))

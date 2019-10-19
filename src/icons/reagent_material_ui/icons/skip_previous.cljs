(ns reagent-material-ui.icons.skip-previous
  "Imports @material-ui/icons/SkipPrevious as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-previous (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6zm3.5 6l8.5 6V6z"})
                                    "SkipPrevious"))

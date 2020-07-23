(ns reagent-material-ui.icons.skip-previous-sharp
  "Imports @material-ui/icons/SkipPreviousSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-previous-sharp (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6V6zm3.5 6l8.5 6V6l-8.5 6z"})
                                          "SkipPreviousSharp"))

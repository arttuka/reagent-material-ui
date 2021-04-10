(ns reagent-material-ui.icons.plus-one-sharp
  "Imports @material-ui/icons/PlusOneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def plus-one-sharp (create-svg-icon (e "path" #js {"d" "M10 8H8v4H4v2h4v4h2v-4h4v-2h-4V8zm4.5-1.92V7.9l2.5-.5V18h2V5l-4.5 1.08z"})
                                     "PlusOneSharp"))

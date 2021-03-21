(ns reagent-material-ui.icons.five-g-sharp
  "Imports @material-ui/icons/FiveGSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def five-g-sharp (create-svg-icon (e "path" #js {"d" "M17 13h2v2h-5V9h7V7h-9v10h9v-6h-4zM3 13h5v2H3v2h7v-6H5V9h5V7H3z"})
                                   "FiveGSharp"))

(ns reagent-material-ui.icons.escalator-sharp
  "Imports @material-ui/icons/EscalatorSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def escalator-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2.5 6h-3.2l-5 9H5.5v-3h3.2l5-9h4.8v3z"})
                                      "EscalatorSharp"))

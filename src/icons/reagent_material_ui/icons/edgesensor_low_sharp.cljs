(ns reagent-material-ui.icons.edgesensor-low-sharp
  "Imports @material-ui/icons/EdgesensorLowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edgesensor-low-sharp (create-svg-icon (e "path" #js {"d" "M2 7h2v7H2V7zm18 3h2v7h-2v-7zM6 2v20h12V2H6zm10 15H8V7h8v10z"})
                                           "EdgesensorLowSharp"))

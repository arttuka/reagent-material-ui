(ns reagent-material-ui.icons.bed-sharp
  "Imports @material-ui/icons/BedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bed-sharp (create-svg-icon (e "path" #js {"d" "M21 10V5H3v5H2v9h2v-2h16v2h2v-9h-1zm-8-3h6v3h-6V7zm-8 3V7h6v3H5zm-1 5v-3h16v3H4z"})
                                "BedSharp"))

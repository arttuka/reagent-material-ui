(ns reagent-material-ui.icons.roofing-sharp
  "Imports @material-ui/icons/RoofingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def roofing-sharp (create-svg-icon (e "path" #js {"d" "M13 18h-2v-2h2v2zm2-4H9v6h6v-6zm4-4.7V4h-3v2.6L12 3 2 12h3l7-6.31L19 12h3l-3-2.7z"})
                                    "RoofingSharp"))

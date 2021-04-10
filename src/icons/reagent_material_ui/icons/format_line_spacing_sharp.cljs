(ns reagent-material-ui.icons.format-line-spacing-sharp
  "Imports @material-ui/icons/FormatLineSpacingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-line-spacing-sharp (create-svg-icon (e "path" #js {"d" "M6 7h2.5L5 3.5 1.5 7H4v10H1.5L5 20.5 8.5 17H6V7zm4-2v2h12V5H10zm0 14h12v-2H10v2zm0-6h12v-2H10v2z"})
                                                "FormatLineSpacingSharp"))

(ns reagent-material-ui.icons.functions-sharp
  "Imports @material-ui/icons/FunctionsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def functions-sharp (create-svg-icon (e "path" #js {"d" "M18 4H6v2l6.5 6L6 18v2h12v-3h-7l5-5-5-5h7V4z"})
                                      "FunctionsSharp"))

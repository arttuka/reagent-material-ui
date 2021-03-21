(ns reagent-material-ui.icons.cases-sharp
  "Imports @material-ui/icons/CasesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cases-sharp (create-svg-icon (e "path" #js {"d" "M18 5V1h-8v4H5v13h18V5h-5zm-2 0h-4V3h4v2zM3 9H1v13h18v-2H3V9z"})
                                  "CasesSharp"))

(ns reagent-material-ui.icons.grid-goldenratio-sharp
  "Imports @material-ui/icons/GridGoldenratioSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def grid-goldenratio-sharp (create-svg-icon (e "path" #js {"d" "M22 11V9h-7V2h-2v7h-2V2H9v7H2v2h7v2H2v2h7v7h2v-7h2v7h2v-7h7v-2h-7v-2h7zm-9 2h-2v-2h2v2z"})
                                             "GridGoldenratioSharp"))

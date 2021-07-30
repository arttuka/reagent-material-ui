(ns reagent-material-ui.icons.source-sharp
  "Imports @material-ui/icons/SourceSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def source-sharp (create-svg-icon (e "path" #js {"d" "m12 6-2-2H2v16h20V6H12zm2 10H6v-2h8v2zm4-4H6v-2h12v2z"})
                                   "SourceSharp"))

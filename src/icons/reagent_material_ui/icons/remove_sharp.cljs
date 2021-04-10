(ns reagent-material-ui.icons.remove-sharp
  "Imports @material-ui/icons/RemoveSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def remove-sharp (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                                   "RemoveSharp"))

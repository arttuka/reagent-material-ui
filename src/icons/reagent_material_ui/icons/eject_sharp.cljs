(ns reagent-material-ui.icons.eject-sharp
  "Imports @material-ui/icons/EjectSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def eject-sharp (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5v-2zm7-12L5.33 15h13.34L12 5z"})
                                  "EjectSharp"))

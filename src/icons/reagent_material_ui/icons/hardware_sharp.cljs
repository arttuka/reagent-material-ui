(ns reagent-material-ui.icons.hardware-sharp
  "Imports @material-ui/icons/HardwareSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hardware-sharp (create-svg-icon (e "path" #js {"d" "m18 3-3 3V3H9C6.24 3 4 5.24 4 8h5v3h6V8l3 3h2V3h-2zM9 13v8h6v-8H9z"})
                                     "HardwareSharp"))

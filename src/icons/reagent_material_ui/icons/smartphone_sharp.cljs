(ns reagent-material-ui.icons.smartphone-sharp
  "Imports @material-ui/icons/SmartphoneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def smartphone-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 18H7V5h10v14z"})
                                       "SmartphoneSharp"))

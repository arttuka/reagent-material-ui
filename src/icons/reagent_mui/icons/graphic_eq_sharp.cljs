(ns reagent-mui.icons.graphic-eq-sharp
  "Imports @mui/icons-material/GraphicEqSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def graphic-eq-sharp (create-svg-icon (e "path" #js {"d" "M7 18h2V6H7v12zm4 4h2V2h-2v20zm-8-8h2v-4H3v4zm12 4h2V6h-2v12zm4-8v4h2v-4h-2z"})
                                       "GraphicEqSharp"))

(ns reagent-mui.icons.military-tech-sharp
  "Imports @mui/icons-material/MilitaryTechSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def military-tech-sharp (create-svg-icon (e "path" #js {"d" "M17 11V2H7v9l4.66 2.8-.99 2.34-3.41.29 2.59 2.24L9.07 22 12 20.23 14.93 22l-.78-3.33 2.59-2.24-3.41-.29-.99-2.34L17 11zm-4 1.23-1 .6-1-.6V3h2v9.23z"})
                                          "MilitaryTechSharp"))

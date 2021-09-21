(ns reagent-mui.icons.add-to-home-screen-sharp
  "Imports @mui/icons-material/AddToHomeScreenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-to-home-screen-sharp (create-svg-icon (e "path" #js {"d" "M20 1.01 6 1v5h2V5h10v14H8v-1H6v5h14V1.01zM10 15h2V8H5v2h3.59L3 15.59 4.41 17 10 11.41V15z"})
                                               "AddToHomeScreenSharp"))

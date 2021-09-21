(ns reagent-mui.icons.laptop-sharp
  "Imports @mui/icons-material/LaptopSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def laptop-sharp (create-svg-icon (e "path" #js {"d" "m20 18 2-2V4H2v12l2 2H0v2h24v-2h-4zM4 6h16v10H4V6z"})
                                   "LaptopSharp"))

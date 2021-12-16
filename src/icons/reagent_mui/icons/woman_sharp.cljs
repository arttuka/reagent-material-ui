(ns reagent-mui.icons.woman-sharp
  "Imports @mui/icons-material/WomanSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def woman-sharp (create-svg-icon [(e "path" #js {"d" "M13.41 7h-2.82L7 16h3v6h4v-6h3z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                  "WomanSharp"))

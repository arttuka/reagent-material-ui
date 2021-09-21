(ns reagent-mui.icons.ad-units-sharp
  "Imports @mui/icons-material/AdUnitsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ad-units-sharp (create-svg-icon [(e "path" #js {"d" "M19 1H5v22h14V1zm-2 18H7V5h10v14z"}) (e "path" #js {"d" "M8 6h8v2H8z"})]
                                     "AdUnitsSharp"))

(ns reagent-mui.icons.density-large
  "Imports @mui/icons-material/DensityLarge as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def density-large (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm0 16h18v2H3z"})
                                    "DensityLarge"))

(ns reagent-mui.icons.data-thresholding-sharp
  "Imports @mui/icons-material/DataThresholdingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def data-thresholding-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM10.67 8.17l2 2 3.67-3.67 1.41 1.41L12.67 13l-2-2-3 3-1.41-1.41 4.41-4.42zM5 16h1.72L5 17.72V16zm.84 3 3-3h1.83l-3 3H5.84zm3.96 0 3-3h1.62l-3 3H9.8zm3.73 0 3-3h1.62l-3 3h-1.62zM19 19h-1.73L19 17.27V19z"})
                                              "DataThresholdingSharp"))

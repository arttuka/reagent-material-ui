(ns reagent-mui.icons.three-k-plus-sharp
  "Imports @mui/icons-material/ThreeKPlusSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def three-k-plus-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM10 9v6H5.5v-1.5h3v-1h-2v-1h2v-1h-3V9H10zm6 6h-1.75l-1.75-2.25V15H11V9h1.5v2.25L14.25 9H16l-2.25 3L16 15zm3-2.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19v1z"})
                                         "ThreeKPlusSharp"))

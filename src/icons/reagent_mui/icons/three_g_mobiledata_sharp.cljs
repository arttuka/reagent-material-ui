(ns reagent-mui.icons.three-g-mobiledata-sharp
  "Imports @mui/icons-material/ThreeGMobiledataSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def three-g-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M3 7v2h5v2H4v2h4v2H3v2h7V7H3zm18 4v6h-9V7h9v2h-7v6h5v-2h-2.5v-2H21z"})
                                               "ThreeGMobiledataSharp"))

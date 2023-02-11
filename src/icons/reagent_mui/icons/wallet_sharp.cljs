(ns reagent-mui.icons.wallet-sharp
  "Imports @mui/icons-material/WalletSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wallet-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zm-6.25 10.09L4 11.22V10h16v.53l-4.25 3.56zM4 6h16v2H4V6z"})
                                   "WalletSharp"))

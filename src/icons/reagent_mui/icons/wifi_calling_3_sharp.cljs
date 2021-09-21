(ns reagent-mui.icons.wifi-calling-3-sharp
  "Imports @mui/icons-material/WifiCalling3Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-calling-3-sharp (create-svg-icon [(e "path" #js {"d" "M16.49 3c-2.21 0-4.21.9-5.66 2.34l1.06 1.06c1.18-1.18 2.8-1.91 4.59-1.91s3.42.73 4.59 1.91l1.06-1.06C20.7 3.9 18.7 3 16.49 3z"}) (e "path" #js {"d" "M20.03 7.46C19.12 6.56 17.87 6 16.49 6s-2.63.56-3.54 1.46l1.06 1.06c.63-.63 1.51-1.03 2.47-1.03s1.84.39 2.47 1.03l1.08-1.06zm-4.95 2.13L16.49 11l1.41-1.41c-.36-.37-.86-.59-1.41-.59s-1.05.22-1.41.59z"}) (e "path" #js {"d" "m21 15-5-1-2.9 2.9c-2.5-1.43-4.57-3.5-6-6L10 8 9 3H3c0 3.28.89 6.35 2.43 9 1.58 2.73 3.85 4.99 6.57 6.57C14.65 20.1 17.72 21 21 21v-6z"})]
                                           "WifiCalling3Sharp"))
